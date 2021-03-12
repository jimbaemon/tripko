package runa.hoppers.tripko.model.utility;

import lombok.*;
import runa.hoppers.tripko.model.post.Post;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Tag {
    @Id
    @Column(length = 20)
    private String tag;

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;



}
