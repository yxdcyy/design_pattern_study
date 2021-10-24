package com.yxd.behavioral.mementoPattern.demo03;

public class GameRole {

    /**
     * 攻击力
     */
    private int vit;

    /**
     * 防御力
     */
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    // 创建Memento ,即根据当前的状态得到Memento
    public Memento createMemento() {
        return new Memento(this.vit, this.def);
    }

    // 从备忘录对象，恢复GameRole的状态
    public void recoverGameRoleFromMemento(Memento memento) {
        this.def = memento.getDef();
        this.vit = memento.getVit();
    }

    // 显示当前游戏角色的状态
    public void display() {
        System.out.println("游戏角色当前的攻击力：" + this.vit + " 防御力: " + this.def);
    }
}
