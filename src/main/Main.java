package main;

import koneksiDb.Connector;
import guiContent.GuiContent;
/**
 *
 * @author Muhammad Rizqi - 123190083
 */
public class Main {
    public static void main(String[] args) {
        Connector DB = new Connector();
        GuiContent guicontent = new GuiContent(DB);
        guicontent.setVisible(true);
    }
}
