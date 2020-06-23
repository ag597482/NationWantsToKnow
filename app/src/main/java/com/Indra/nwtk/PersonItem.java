package com.Indra.nwtk;

import java.util.ArrayList;

public class PersonItem {

    private String name,email;

    private ArrayList<String> followers = new ArrayList<String>();
    private ArrayList<String> following = new ArrayList<String>();
    private ArrayList<String> friendlist = new ArrayList<String>();
    private ArrayList<String> requestsent = new ArrayList<String>();

    public PersonItem() { }

    public PersonItem(String n,String e)
    {
        name=n;
        email=e;
        followers=null;
        following=null;
        friendlist=null;
        requestsent=null;
    }

    public void addfollower(String s)
    {
        followers.add(s);
    }
    public void addfollowing(String s)
    {
        following.add(s);
    }
    public void addfriendlist(String s)
    {
        friendlist.add(s);
    }
    public void addrequstsetn(String s)
    {
        requestsent.add(s);
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<String> getFollowers(){return followers; }

    public ArrayList<String> getFollowing(){return following; }

    public ArrayList<String> getFriendlist(){return friendlist; }

    public ArrayList<String> getRequestsent(){return requestsent; }

}
