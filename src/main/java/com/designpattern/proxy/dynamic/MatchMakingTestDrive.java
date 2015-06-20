package com.designpattern.proxy.dynamic;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenwinfred on 6/14/15.
 */
public class MatchMakingTestDrive {
    private List<PersonBean> personList = new ArrayList<PersonBean>();

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }


    public MatchMakingTestDrive() {
        initiallizeDataBase();
    }

    public void drive() {
        PersonBean winfred = getPersonFromDatabase("Winfred");
        PersonBean ownerProxy = getOwnerProxy(winfred);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy : " + ownerProxy.getInterests());
        try {
            ownerProxy.setHotOrNotRating(5);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }

        PersonBean john = getPersonFromDatabase("John");
        PersonBean nonOwnerProxy = getNonOwnerProxy(john);
        System.out.println("Name is " + nonOwnerProxy.getName());
        nonOwnerProxy.setHotOrNotRating(7);
        System.out.println("Rating set from owner proxy : " + nonOwnerProxy.getHotOrNotRating());
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from owner proxy");
        }


    }



    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }

    private PersonBean getPersonFromDatabase(String name) {
        for (PersonBean person : personList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    private void initiallizeDataBase() {
        PersonBean p1 = new PersonBeanImpl();
        p1.setName("Winfred");
        p1.setGender("Male");
        p1.setInterests("Badminton, basketball");
        p1.setHotOrNotRating(10);
        personList.add(p1);


        PersonBean p2 = new PersonBeanImpl();
        p2.setName("John");
        p2.setGender("Male");
        p2.setInterests("Table tennis");
        p2.setHotOrNotRating(9);
        personList.add(p2);
    }
}
