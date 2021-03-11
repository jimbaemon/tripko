package runa.hoppers.tripko.model.comment;

import lombok.*;
import runa.hoppers.tripko.model.common.BaseTimeEntity;
import runa.hoppers.tripko.model.post.Post;
import runa.hoppers.tripko.model.user.User;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Comment extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "comment_parent_id")
    private Comment parentId;

    @Lob
    @Column(nullable = false)
    private String content;


    private Long deletedBy;

    private int deletedYN;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User createdBy;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post postId;
}
