//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package noppes.npcs.api.gui;

public interface IButton extends ICustomGuiComponent {
    int getWidth();

    int getHeight();

    IButton setSize(int width, int height);

    String getLabel();

    IButton setLabel(String text);

    String getTexture();

    boolean hasTexture();

    IButton setTexture(String texture);

    int getTextureX();

    int getTextureY();

    IButton setTextureOffset(int textureX, int textureY);

    void setScale(float scale);

    float getScale();

    void setEnabled(boolean enabled);

    boolean isEnabled();
}
