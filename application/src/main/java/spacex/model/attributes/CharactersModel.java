package main.java.spacex.model.attributes;

public abstract class CharactersModel {
    
    private int damage;
    private int def;
    private String atk;
    private String hp;
    private String xp;
    private String life;
    private String power;
    private String buff;
    private boolean drone;


    /**
     * 功能描述: damage
     *
     * @return int
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public int getDamage() {
        return this.damage;
    }

    /**
     * 功能描述: damage
     *
     * @param damage damage
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * 功能描述: def
     *
     * @return int
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public int getDef() {
        return this.def;
    }

    /**
     * 功能描述: def
     *
     * @param def def
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public void setDef(int def) {
        this.def = def;
    }

    /**
     * 功能描述: atk
     *
     * @return String
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public String getAtk() {
        return this.atk;
    }

    /**
     * 功能描述: atk
     *
     * @param atk atk
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public void setAtk(String atk) {
        this.atk = atk;
    }

    /**
     * 功能描述: hp
     *
     * @return String
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public String getHp() {
        return this.hp;
    }

    /**
     * 功能描述: hp
     *
     * @param hp hp
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public void setHp(String hp) {
        this.hp = hp;
    }

    /**
     * 功能描述: xp
     *
     * @return String
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public String getXp() {
        return this.xp;
    }

    /**
     * 功能描述: xp
     *
     * @param xp xp
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public void setXp(String xp) {
        this.xp = xp;
    }

    /**
     * 功能描述: life
     *
     * @return String
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public String getLife() {
        return this.life;
    }

    /**
     * 功能描述: life
     *
     * @param life life
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public void setLife(String life) {
        this.life = life;
    }

    /**
     * 功能描述: power
     *
     * @return String
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public String getPower() {
        return this.power;
    }

    /**
     * 功能描述: power
     *
     * @param power power
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public void setPower(String power) {
        this.power = power;
    }

    /**
     * 功能描述: buff
     *
     * @return String
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public String getBuff() {
        return this.buff;
    }

    /**
     * 功能描述: buff
     *
     * @param buff buff
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public void setBuff(String buff) {
        this.buff = buff;
    }

    /**
     * 功能描述: drone
     *
     * @return boolean
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public boolean getDrone() {
        return this.drone;
    }

    /**
     * 功能描述: drone
     *
     * @param drone drone
     * @author maurilio maurilio@email.com
     * @date 2022/02/07 17:46:56
     */
    public void setDrone(boolean drone) {
        this.drone = drone;
    }

}
