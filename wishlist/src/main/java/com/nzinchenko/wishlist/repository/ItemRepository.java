package com.nzinchenko.wishlist.repository;
import com.nzinchenko.wishlist.entity.WishlistItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<WishlistItem, Long> {}
