package com.nzinchenko.wishlist.controller;
import com.nzinchenko.wishlist.entity.WishlistItem;
import com.nzinchenko.wishlist.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/items")
public class WishlistController {

    @Autowired
    private WishlistService service;

    @GetMapping
    public List<WishlistItem> getItems() {
        return service.getAllItems();
    }

    // Ми передаємо лише URL, а парсер сам знаходить назву
    @PostMapping("/add")
    public WishlistItem addItem(@RequestParam String url) {
        return service.addItemFromUrl(url);
    }
}
