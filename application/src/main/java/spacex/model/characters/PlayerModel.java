package main.java.spacex.model.characters;

import javax.swing.ImageIcon;

import main.java.spacex.model.attributes.CharactersModel;

public class PlayerModel extends CharactersModel{
        private int id;
        private ImageIcon skin;
        private String skinPath;
        private String objName;


    /**
     * descriotion: id
     *
     * @return int
     * @author maurilio maurilio1.5@hotmail.com
     * @date 2022/02/07 16:58:37
     */
    public int getId() {
        return this.id;
    }

    /**
     * descriotion: id
     *
     * @param id id
     * @author maurilio maurilio1.5@hotmail.com
     * @date 2022/02/07 16:58:37
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * descriotion: skin
     *
     * @return ImageIcon
     * @author maurilio maurilio1.5@hotmail.com
     * @date 2022/02/07 16:58:37
     */
    public ImageIcon getSkin() {
        return this.skin;
    }

    /**
     * descriotion: skin
     *
     * @param skin skin
     * @author maurilio maurilio1.5@hotmail.com
     * @date 2022/02/07 16:58:37
     */
    public void setSkin(ImageIcon skin) {
        this.skin = skin;
    }

    /**
     * descriotion: skinPath
     *
     * @return String
     * @author maurilio maurilio1.5@hotmail.com
     * @date 2022/02/07 16:58:37
     */
    public String getSkinPath() {
        return this.skinPath;
    }

    /**
     * descriotion: skinPath
     *
     * @param skinPath skinPath
     * @author maurilio maurilio1.5@hotmail.com
     * @date 2022/02/07 16:58:37
     */
    public void setSkinPath(String skinPath) {
        this.skinPath = skinPath;
    }

    /**
     * descriotion: objName
     *
     * @return String
     * @author maurilio maurilio1.5@hotmail.com
     * @date 2022/02/07 16:58:37
     */
    public String getObjName() {
        return this.objName;
    }

    /**
     * descriotion: objName
     *
     * @param objName objName
     * @author maurilio maurilio1.5@hotmail.com
     * @date 2022/02/07 16:58:37
     */
    public void setObjName(String objName) {
        this.objName = objName;
    }
        
}
