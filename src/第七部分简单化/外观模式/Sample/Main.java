package 第七部分简单化.外观模式.Sample;

import 第七部分简单化.外观模式.Sample.pagemaker.PageMaker;

/**
 * author: zzw5005
 * date: 2018/9/3 14:44
 */

/*
* 请求者角色，负责调用窗口角色。但是请求者角色并不包括在窗口模式。
* */
public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "Welcome.html");
    }
}
