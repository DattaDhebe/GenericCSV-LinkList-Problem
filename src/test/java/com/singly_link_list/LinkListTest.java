package com.singly_link_list;

import org.junit.Assert;
import org.junit.Test;

public class LinkListTest {

    @Test
    public void givenInteger_ShouldAddToLinkList() {
        LinkList<Integer> linkList = new LinkList();
        linkList.toAdd(2);
        linkList.toAdd(4);
        String result = linkList.toPrint();
        Assert.assertEquals("2 4 ", result);
    }

    @Test
    public void givenString_ShouldAddToLinkList() {
        LinkList<String> linkList = new LinkList();
        linkList.toAdd("Datta");
        linkList.toAdd("Dhebe");
        String result = linkList.toPrint();
        Assert.assertEquals("Datta Dhebe ", result);
    }


}
