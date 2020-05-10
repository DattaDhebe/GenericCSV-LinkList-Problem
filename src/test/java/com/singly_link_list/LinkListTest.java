package com.singly_link_list;

import org.junit.Assert;
import org.junit.Test;

public class LinkListTest {

    @Test
    public void givenInteger_ShouldAddToLinkList_andReturnThatList() {
        LinkList<Integer> linkList = new LinkList();
        linkList.add(2);
        linkList.add(4);
        Assert.assertEquals("[ 2, 4 ]", linkList.toString());
    }

    @Test
    public void givenString_ShouldAddToLinkList_andReturnThatList() {
        LinkList<String> linkList = new LinkList();
        linkList.add("Datta");
        linkList.add("Dhebe");
        Assert.assertEquals("[ Datta, Dhebe ]", linkList.toString());
    }

    @Test
    public void givenInteger_WhenRemove_shouldRemoveElement() {
        LinkList<Integer> linkList = new LinkList();
        linkList.add(2);
        linkList.add(4);
        linkList.remove();
        Assert.assertEquals("[ 2 ]", linkList.toString());
    }








}
