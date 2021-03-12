package runa.hoppers.tripko.model.utility;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import runa.hoppers.tripko.model.post.Post;
import runa.hoppers.tripko.model.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class RecentView {
    @EmbeddedId
    private RecentViewKey id;

    @ManyToOne
    @MapsId("user")
    private User user;

    @ManyToOne
    @MapsId("post")
    private Post post;

    @CreatedDate
    private LocalDateTime viewAt;


}
