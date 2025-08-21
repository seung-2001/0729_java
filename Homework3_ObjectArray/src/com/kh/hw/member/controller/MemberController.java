package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
    private Member[] m = new Member[SIZE];
    public static final int SIZE = 10;
    
    // static 블럭
    static{
    	System.out.println("호잇 나는 정말 빠르닷");
    }
    
    // 초기화 블럭
    {
    	m[0] = new Member("admin", "관리자", "ad1234", "admin@kh.com",'M',100);
    }

    public int existMemberNum() {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] != null) { 
                count++;
            }
        }
        return count;
    }

    public boolean checkId(String inputId) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] != null && m[i].getId().equals(inputId)) { 
                return true;
            }
        }
        return false;
    }

    public void insertMember(String id, String name, String password, String email, char gender, int age) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] == null) {
                m[i] = new Member(id, name, password, email, gender, age);
                break;
            }
        }
    }

    public String searchId(String id) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] != null && m[i].getId().equals(id)) {
                return m[i].inform();
            }
        }
        return null;
    }

    public Member[] searchName(String name) {
        Member[] result = new Member[SIZE];
        int index = 0;

        for (int i = 0; i < m.length; i++) {
            if (m[i] != null && m[i].getName().equals(name)) {
                result[index] = m[i];
                index++;
            }
        }

        if (index == 0) {
            return null;
        } else {
            return result;
        }
    }

    public Member[] searchEmail(String email) {
        Member[] result = new Member[SIZE];
        int index = 0;

        for (int i = 0; i < m.length; i++) {
            if (m[i] != null && m[i].getEmail().equals(email)) {
                result[index] = m[i];
                index++;
            }
        }

        if (index == 0) {
            return null;
        } else {
            return result;
        }
    }

    public boolean updatePassword(String id, String password) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] != null && m[i].getId().equals(id)) {
                m[i].setPassword(password);
                return true;
            }
        }
        return false;
    }

    public boolean updateName(String id, String name) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] != null && m[i].getId().equals(id)) {
                m[i].setName(name);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmail(String id, String email) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] != null && m[i].getId().equals(id)) {
                m[i].setEmail(email);
                return true;
            }
        }
        return false;
    }

    public boolean delete(String id) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] != null && m[i].getId().equals(id)) {
                m[i] = null;
                return true;
            }
        }
        return false;
    }

    public void delete() {
        for (int i = 0; i < m.length; i++) {
            m[i] = null;
        }
    }

    public Member[] printAll() {
        return m;
    }
}
