package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 14.08.2017
 */
public class StringDecodingTest {
    @Test
    public void codeString() throws Exception {
        Assert.assertEquals("Hh9h4e4l2o5",StringDecoding.codeString("Hhhhhhhhhhhhhheeeellooooo"));
        Assert.assertEquals("h9h3",StringDecoding.codeString("hhhhhhhhhhhh"));
        Assert.assertEquals("",StringDecoding.codeString(""));

    }

    @Test
    public void decodeString() throws Exception {
        Assert.assertEquals("Hhhhhhhhhhhhhheeeellooooo",StringDecoding.decodeString("Hh9h4e4l2o5"));
        Assert.assertEquals("hhhhhhhhhhhh",StringDecoding.decodeString("h9h3"));
        Assert.assertEquals("",StringDecoding.decodeString("H09h3e4l2o5"));
        Assert.assertEquals("",StringDecoding.decodeString("Hh90helo"));
        Assert.assertEquals("",StringDecoding.decodeString("1h9h3e4l2o5"));
        Assert.assertEquals("",StringDecoding.decodeString("H19h3e4l2o5"));
        Assert.assertEquals("",StringDecoding.decodeString("Hhhhhhhhhhhhhheeeellooooo"));
        Assert.assertEquals("Xvvzzz",StringDecoding.decodeString("Xv2z3"));
        Assert.assertEquals("",StringDecoding.decodeString(""));
        Assert.assertEquals("",StringDecoding.decodeString(""));
        Assert.assertEquals("",StringDecoding.decodeString(""));



         Assert.assertEquals("###bbaaaaaaaogg",StringDecoding.decodeString("#3b2a7og2")); //###bbaaaaaaaogg
         Assert.assertEquals("     rrrrrrrr***_m%",StringDecoding.decodeString(" 5r8*3_m%")); //     rrrrrrrr***_m%
         Assert.assertEquals("H+++++++++!",StringDecoding.decodeString("H+9!")); //H+++++++++!
         Assert.assertEquals("?!@#$%^&*()_+{}{}{}!",StringDecoding.decodeString("?!@#$%^&*()_+{}{}{}!")); //?!@#$%^&*()_+{}{}{}!
         Assert.assertEquals("weret",StringDecoding.decodeString("weret")); //weret
         Assert.assertEquals(",",StringDecoding.decodeString(",")); //,
         Assert.assertEquals(".",StringDecoding.decodeString("."));//.
         Assert.assertEquals("eeeellooooo",StringDecoding.decodeString("e4l2o5"));//eeeellooooo
         Assert.assertEquals("fffkkz",StringDecoding.decodeString("f3k2z"));//fffkkz
         Assert.assertEquals("fffk",StringDecoding.decodeString("f3k"));//fffk
         Assert.assertEquals("f",StringDecoding.decodeString("f"));//f

//err ->""
        Assert.assertEquals("",StringDecoding.decodeString("9f4t5"));
        Assert.assertEquals("",StringDecoding.decodeString("H195x"));
        Assert.assertEquals("",StringDecoding.decodeString("1h9h3e4l2o5"));
        Assert.assertEquals("",StringDecoding.decodeString("h9hh6"));
        Assert.assertEquals("",StringDecoding.decodeString("aaa"));
        Assert.assertEquals("",StringDecoding.decodeString("Hh90helo"));
        Assert.assertEquals("",StringDecoding.decodeString("2v3z"));
        Assert.assertEquals("",StringDecoding.decodeString("v1d2"));
        Assert.assertEquals("",StringDecoding.decodeString("v0d2"));
        Assert.assertEquals("",StringDecoding.decodeString("Hhhhhhhhhhhhhheeeellooooo"));
        Assert.assertEquals("",StringDecoding.decodeString("null"));
        Assert.assertEquals("",StringDecoding.decodeString("null"));
        Assert.assertEquals("",StringDecoding.decodeString(""));
    }

}