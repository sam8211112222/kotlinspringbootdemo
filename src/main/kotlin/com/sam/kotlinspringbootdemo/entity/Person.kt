package com.sam.kotlinspringbootdemo.entity

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "testaccount")
class Person {

    @Id
    @Column(name = "userid")
    var userid:Int = 0
    @Column(name = "username")
    lateinit var username:String
    @Column(name = "userpassword")
    lateinit var userpassword:String
}