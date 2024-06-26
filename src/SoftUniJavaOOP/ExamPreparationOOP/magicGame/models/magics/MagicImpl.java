package SoftUniJavaOOP.ExamPreparationOOP.magicGame.models.magics;

import SoftUniJavaOOP.ExamPreparationOOP.magicGame.common.ExceptionMessages;


public abstract class MagicImpl implements Magic {

    private String name;
    private int bulletsCount;

    public MagicImpl(String name, int bulletsCount){
        if(name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.INVALID_MAGIC_NAME);
        }
        if(bulletsCount<0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_MAGIC_BULLETS_COUNT);
        }
        this.name = name;
        this.bulletsCount = bulletsCount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getBulletsCount() {
        return bulletsCount;
    }

    protected void setBulletsCount(int bulletsCount) {
        this.bulletsCount = bulletsCount;
    }
}
