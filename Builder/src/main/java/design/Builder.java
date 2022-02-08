package design;

import base.ceiling.LevelOneCeiling;
import base.ceiling.LevelTwoCeiling;
import base.coat.DuluxCoat;
import base.coat.LiBangCoat;
import base.floor.ShengXiangFloor;
import base.tile.DongPengTile;
import base.tile.MarcoPoloTile;

public class Builder {
    /*
    如此可以将对象的构建都封装在一起，再对外提供不用的方法接口，实现了解耦
     */


    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }


    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }


}
