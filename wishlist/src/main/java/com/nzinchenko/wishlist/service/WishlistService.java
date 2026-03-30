package com.nzinchenko.wishlist.service;
import com.nzinchenko.wishlist.entity.WishlistItem;
import com.nzinchenko.wishlist.repository.ItemRepository;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.List;

@Service
public class WishlistService {
    @Autowired
    private ItemRepository repository;

    // Парсинг заголовка сторінки за посиланням
    public WishlistItem addItemFromUrl(String url) {
        WishlistItem item = new WishlistItem();
        item.setProductUrl(url);
        try {
            // Jsoup йде за посиланням і забирає HTML сторінки
            Document doc = Jsoup.connect(url).get();
            item.setTitle(doc.title()); // Витягуємо тег <title>
        } catch (IOException e) {
            item.setTitle("Назва не знайдена");
        }
        return repository.save(item);
    }

    public List<WishlistItem> getAllItems() {
        return repository.findAll();
    }
}
