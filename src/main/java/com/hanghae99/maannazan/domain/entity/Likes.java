package com.hanghae99.maannazan.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Getter
@NoArgsConstructor
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "POST_ID")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "COMMENT_ID")
    private Comment comment;

    public Likes(Post post, User user) {
        this.user= user;
        this.post= post;
    }

    public Likes(Comment comment, User user) {
        this.user= user;
        this.comment= comment;
    }

}




