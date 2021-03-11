package runa.hoppers.tripko.model.user;

import lombok.*;
import runa.hoppers.tripko.model.common.BaseTimeEntity;
import runa.hoppers.tripko.model.post.Post;
import runa.hoppers.tripko.model.utility.RecentView;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Set;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100, unique = true)
    private String username;

    @Column(nullable = false, length = 500)
    private String password;

    @Column(nullable = false, length = 500)
    @Email
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Role role;

    @Column(length = 400)
    private String description;

    @Column(length = 2083)
    private String thumbnail;
    @Column(length = 2083)
    private String facebookUrl;
    @Column(length = 2083)
    private String websiteUrl;
    @Column(length = 2083)
    private String instagramUrl;

    private Long deletedBy;

    @ManyToMany
    Set<Post> likedPost;

    @OneToMany(mappedBy = "user")
    Set<RecentView> recentViews;


}
