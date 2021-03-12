package runa.hoppers.tripko.model.utility;


import runa.hoppers.tripko.model.post.Post;
import runa.hoppers.tripko.model.user.User;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RecentViewKey implements Serializable {
    @Column(name = "user_id")
    private Long user;

    @Column(name = "post_id")
    private Long post;
}
