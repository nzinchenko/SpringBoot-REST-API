package com.nzinchenko.wishlist.controller;
import com.nzinchenko.wishlist.entity.WishlistItem;
import com.nzinchenko.wishlist.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.nzinchenko.wishlist.dto.ItemUpdateDTO;
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

    @PostMapping("/add")
    public WishlistItem addItem(@RequestParam String url) {
        return service.addItemFromUrl(url);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        service.deleteItem(id);
    }

    @PutMapping("/{id}")
    public WishlistItem updateItem(@PathVariable Long id, @RequestBody ItemUpdateDTO dto) {
        return service.updateItem(id, dto.getNewTitle());
    }
}
