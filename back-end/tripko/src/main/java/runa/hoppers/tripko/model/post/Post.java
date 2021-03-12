package runa.hoppers.tripko.model.post;

import lombok.*;
import runa.hoppers.tripko.model.common.BaseTimeEntity;
import runa.hoppers.tripko.model.user.User;
import runa.hoppers.tripko.model.utility.RecentView;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Post extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 15)
    private Location place;

    @Column(nullable = false, length = 30)
    private String title;

    @Column(length = 2083)
    private String thumbnail;

    @Lob
    @Column(nullable = false)
    private String content;

    @Lob
    @Column(nullable = false)
    private String shortDescription;

    @Column(nullable = false, length = 1)
    private int deletedYN;

    @Column(nullable = false)
    private Long deletedBy;

    @ManyToMany
    private Set<User> likes;

    @OneToMany(mappedBy = "post")
    private Set<RecentView> recentViews;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User createdBy;




}
