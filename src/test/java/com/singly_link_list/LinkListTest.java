package com.singly_link_list;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class LinkListTest {

    @Test
    public void givenAddInteger_ShouldAddToLinkList_andReturnThatList() {
        LinkList<Integer> linkList = new LinkList();
        linkList.add(2);
        linkList.add(4);
        Assert.assertEquals("[ 2, 4 ]", linkList.toString());
    }

    @Test
    public void givenAddString_ShouldAddToLinkList_andReturnThatList() {
        LinkList<String> linkList = new LinkList();
        linkList.add("Datta");
        linkList.add("Dhebe");
        Assert.assertEquals("[ Datta, Dhebe ]", linkList.toString());
    }

    @Test
    public void givenRemoveInteger_WhenRemove_shouldRemoveLastElement() {
        LinkList<Integer> linkList = new LinkList();
        linkList.add(2);
        linkList.add(4);
        linkList.remove();
        Assert.assertEquals("[ 2 ]", linkList.toString());
    }

    @Test
    public void givenRemoveString_WhenRemove_shouldRemoveLastElement() {
        LinkList<String> linkList = new LinkList();
        linkList.add("Datta");
        linkList.add("Dhebe");
        linkList.remove();
        Assert.assertEquals("[ Datta ]", linkList.toString());
    }

    @Test
    public void givenSearchItem_WhenSearch_ifPresent_shouldReturnTrue() {
        LinkList<Integer> linkList = new LinkList();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        boolean result = linkList.search(2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenSearchItem_WhenSearch_ifAbsent_shouldReturnFalse() {
        LinkList<Integer> linkList = new LinkList();
        linkList.add(1);
        linkList.add(2);
        linkList.add(4);
        boolean result = linkList.search(3);
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmptyList_shouldReturnTrue() {
        LinkList<Integer> linkList = new LinkList<>();
        Assert.assertTrue(linkList.isEmpty());
    }

    @Test
    public void givenFullList_shouldReturnFalse() {
        LinkList<Integer> linkList = new LinkList<>();
        linkList.add(1);
        linkList.add(2);
        Assert.assertFalse(linkList.isEmpty());
    }

    @Test
    public void givenSizeMethod_shouldReturn_numberOfElement() {
        LinkList<Integer> linkList = new LinkList<>();
        linkList.add(1);
        linkList.add(2);
        Assert.assertEquals(2,linkList.size());
    }

    @Test
    public void givenAppendInteger_shouldAdd_elementAtLast() {
        LinkList<Integer> linkList = new LinkList<>();
        linkList.add(1);
        linkList.append(2);
        Assert.assertEquals(2,linkList.size());
    }

    @Test
    public void givenAppendString_whouldAdd_elementAtLast() {
        LinkList<String> linkList = new LinkList();
        linkList.add("Datta");
        linkList.append("Dhebe");
        Assert.assertEquals("[ Datta, Dhebe ]", linkList.toString());
    }

    @Test
    public void givenIndexInteger_shouldReturn_positionOfElement() {
        LinkList<Integer> linkList = new LinkList<>();
        linkList.add(9);
        linkList.add(7);
        linkList.add(4);
        linkList.add(3);
        Assert.assertEquals(2,linkList.index(7));
    }

    @Test
    public void givenIndexString_shouldReturn_positionOfElement() {
        LinkList<String> linkList = new LinkList();
        linkList.add("Apple");
        linkList.append("Mango");
        linkList.append("Banana");
        linkList.append("Peach");
        Assert.assertEquals(3, linkList.index("Banana"));
    }







}
