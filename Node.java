/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_auto;

/**
 *
 * @author Jirasin Sirorattanap
 */
public class Node {

    int x;
    int y;
    int mouseOffsetX = 0;
    int mouseOffsetY = 0;
    boolean isAcceptState = false;
    String test;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setMouseStart(int x, int y) {
        this.mouseOffsetX = this.x - x;
        this.mouseOffsetY = this.y - y;
    }
    

}
