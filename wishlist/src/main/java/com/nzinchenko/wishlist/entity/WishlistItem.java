package com.nzinchenko.wishlist.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "wishlist_items")
public class WishlistItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String productUrl;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private AppUser user;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getProductUrl() { return productUrl; }
    public void setProductUrl(String productUrl) { this.productUrl = productUrl; }
    public AppUser getUser() { return user; }
    public void setUser(AppUser user) { this.user = user; }
}
