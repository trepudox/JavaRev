package com.trepudox.web.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class MD5Object {

    private String original;
    private String md5;

}
