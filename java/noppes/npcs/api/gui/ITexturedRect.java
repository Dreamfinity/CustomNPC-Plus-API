//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package noppes.npcs.api.gui;

public interface ITexturedRect extends ICustomGuiComponent {
    String getTexture();

    ITexturedRect setTexture(String texture);

    int getWidth();

    int getHeight();

    ITexturedRect setSize(int width, int height);

    float getScale();

    ITexturedRect setScale(float scale);

    int getTextureX();

    int getTextureY();

    ITexturedRect setTextureOffset(int textureX, int textureY);
}
