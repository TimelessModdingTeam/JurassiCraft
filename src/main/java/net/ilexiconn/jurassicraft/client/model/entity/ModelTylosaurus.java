package net.ilexiconn.jurassicraft.client.model.entity;

import net.ilexiconn.jurassicraft.client.model.base.MowzieModelBase;
import net.ilexiconn.jurassicraft.common.entity.reptiles.EntityTylosaurus;
import net.ilexiconn.jurassicraft.client.model.base.MowzieModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTylosaurus extends MowzieModelBase {
    public MowzieModelRenderer Neck;
    public MowzieModelRenderer Lowerjawrear;
    public MowzieModelRenderer Mainhead;
    public MowzieModelRenderer BodySection1;
    public MowzieModelRenderer Neckback1;
    public MowzieModelRenderer Neckback2;
    public MowzieModelRenderer Lowerjawforward;
    public MowzieModelRenderer Chin;
    public MowzieModelRenderer Leftbrow;
    public MowzieModelRenderer Rightbrow;
    public MowzieModelRenderer UpperJaw;
    public MowzieModelRenderer UpperJawRidge;
    public MowzieModelRenderer Innerteeth;
    public MowzieModelRenderer Outerteeth;
    public MowzieModelRenderer BodySection2;
    public MowzieModelRenderer Neckback3;
    public MowzieModelRenderer RightFrontFlipper;
    public MowzieModelRenderer LeftFrontFlipper;
    public MowzieModelRenderer BodySection3;
    public MowzieModelRenderer Neckback4;
    public MowzieModelRenderer TailSection1;
    public MowzieModelRenderer RightBackFlipper;
    public MowzieModelRenderer LeftBackFlipper;
    public MowzieModelRenderer TailSection2;
    public MowzieModelRenderer TailSection3;
    public MowzieModelRenderer TailSection4;
    public MowzieModelRenderer Upperknob14;
    public MowzieModelRenderer Upperknob15;
    public MowzieModelRenderer FlukeSection1;
    public MowzieModelRenderer Upperknob16;
    public MowzieModelRenderer Upperknob17;
    public MowzieModelRenderer Upperknob18;
    public MowzieModelRenderer Upperknob19;
    public MowzieModelRenderer FlukeSection2;
    public MowzieModelRenderer FlukeSection3;
    public MowzieModelRenderer Lowerknob1;
    public MowzieModelRenderer Lowerknob2;
    public MowzieModelRenderer Lowerknob3;
    public MowzieModelRenderer Lowerknob4;
    public MowzieModelRenderer Upperknob20;
    public MowzieModelRenderer Upperknob21;
    public MowzieModelRenderer Upperknob22;
    public MowzieModelRenderer Upperknob23;
    public MowzieModelRenderer Upperknob24;
    public MowzieModelRenderer FlukeSection5;
    public MowzieModelRenderer FlukeSection7;
    public MowzieModelRenderer FlukeSection8;
    public MowzieModelRenderer FlukeSection6;
    public MowzieModelRenderer Upperknob25;
    public MowzieModelRenderer Upperknob26;
    public MowzieModelRenderer Upperknob27;
    public MowzieModelRenderer Lowerknob5;
    public MowzieModelRenderer Lowerknob6;
    public MowzieModelRenderer Lowerknob7;
    public MowzieModelRenderer Lowerknob8;
    public MowzieModelRenderer Lowerknob9;
    public MowzieModelRenderer Lowerknob10;
    public MowzieModelRenderer Upperknob11;
    public MowzieModelRenderer Upperknob12;
    public MowzieModelRenderer Upperknob13;
    public MowzieModelRenderer Upperknob6;
    public MowzieModelRenderer Upperknob7;
    public MowzieModelRenderer Upperknob8;
    public MowzieModelRenderer Upperknob9;
    public MowzieModelRenderer Upperknob10;
    public MowzieModelRenderer Upperknob1;
    public MowzieModelRenderer Upperknob2;
    public MowzieModelRenderer Upperknob3;
    public MowzieModelRenderer Upperknob4;
    public MowzieModelRenderer Upperknob5;
    public MowzieModelRenderer[] bodyParts;

    public ModelTylosaurus() {
        this.textureWidth = 256;
        this.textureHeight = 200;
        this.RightFrontFlipper = new MowzieModelRenderer(this, 203, 0);
        this.RightFrontFlipper.setRotationPoint(-9.0F, 8.8F, 14.6F);
        this.RightFrontFlipper.addBox(-9.0F, 0.0F, -3.0F, 8, 2, 16, 0.0F);
        this.setRotateAngle(RightFrontFlipper, -0.296705972839036F, -1.161865683052625F, 0.0F);
        this.Rightbrow = new MowzieModelRenderer(this, 211, 160);
        this.Rightbrow.setRotationPoint(-2.6F, -2.3F, -15.8F);
        this.Rightbrow.addBox(-1.3F, 0.0F, 0.0F, 1, 3, 17, 0.0F);
        this.setRotateAngle(Rightbrow, 0.2684316389567279F, 0.10279989294246601F, -0.9365436766201571F);
        this.UpperJawRidge = new MowzieModelRenderer(this, 0, 69);
        this.UpperJawRidge.setRotationPoint(-2.5F, 1.0F, -7.7F);
        this.UpperJawRidge.addBox(0.0F, 0.0F, 0.0F, 6, 2, 15, 0.0F);
        this.setRotateAngle(UpperJawRidge, 0.25202554398798116F, -0.0F, 0.0F);
        this.Lowerjawrear = new MowzieModelRenderer(this, 45, 102);
        this.Lowerjawrear.setRotationPoint(2.5F, 10.1F, 0.7F);
        this.Lowerjawrear.addBox(-4.0F, -2.5F, -4.0F, 7, 3, 5, 0.0F);
        this.setRotateAngle(Lowerjawrear, 0.024609142453120045F, 0.0F, 0.0F);
        this.Upperknob17 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob17.setRotationPoint(-0.5F, -0.7F, 9.1F);
        this.Upperknob17.addBox(0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Upperknob17, -0.08621926504851989F, 0.0F, 0.0F);
        this.Lowerknob2 = new MowzieModelRenderer(this, 0, 0);
        this.Lowerknob2.setRotationPoint(-0.5F, 8.0F, 7.1F);
        this.Lowerknob2.addBox(0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Lowerknob2, -2.8043950421044888F, -0.0F, 0.0F);
        this.TailSection1 = new MowzieModelRenderer(this, 0, 173);
        this.TailSection1.setRotationPoint(0.5F, 0.6F, 9.8F);
        this.TailSection1.addBox(-4.5F, 0.0F, 0.0F, 9, 11, 9, 0.0F);
        this.setRotateAngle(TailSection1, -0.03717551306747922F, -1.0463605494025895E-16F, 0.0F);
        this.Lowerknob5 = new MowzieModelRenderer(this, 0, 0);
        this.Lowerknob5.setRotationPoint(-0.5F, -6.3F, -3.1F);
        this.Lowerknob5.addBox(0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Lowerknob5, -2.9429741847128383F, -0.0F, 0.0F);
        this.Upperknob27 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob27.setRotationPoint(-0.5F, -2.7F, 7.9F);
        this.Upperknob27.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Upperknob27, -0.4310963252425994F, -0.0F, 0.0F);
        this.Lowerknob7 = new MowzieModelRenderer(this, 0, 0);
        this.Lowerknob7.setRotationPoint(-0.5F, -6.3F, -10.5F);
        this.Lowerknob7.addBox(0.0F, -3.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Lowerknob7, -2.8070130359824805F, -0.0F, 0.0F);
        this.FlukeSection1 = new MowzieModelRenderer(this, 0, 17);
        this.FlukeSection1.setRotationPoint(0.0F, 2.5F, -9.6F);
        this.FlukeSection1.addBox(-1.0F, -2.0F, 0.0F, 2, 6, 22, 0.0F);
        this.setRotateAngle(FlukeSection1, 0.14032447186034408F, -0.0F, 0.0F);
        this.Upperknob23 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob23.setRotationPoint(-0.5F, -4.1F, 10.8F);
        this.Upperknob23.addBox(0.0F, -3.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Upperknob23, -0.17715091907742445F, -0.0F, 0.0F);
        this.Upperknob24 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob24.setRotationPoint(-0.5F, -2.9F, 13.6F);
        this.Upperknob24.addBox(0.0F, -3.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Upperknob24, -0.29618237406343767F, -0.0F, 0.0F);
        this.Upperknob7 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob7.setRotationPoint(-1.0F, 0.1F, -6.0F);
        this.Upperknob7.addBox(0.0F, -3.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Upperknob7, -0.18081611050661253F, -0.0F, 0.0F);
        this.TailSection2 = new MowzieModelRenderer(this, 38, 176);
        this.TailSection2.setRotationPoint(0.0F, 0.7F, 7.5F);
        this.TailSection2.addBox(-4.0F, 0.0F, 0.0F, 8, 9, 9, 0.0F);
        this.setRotateAngle(TailSection2, 0.0015707963267948967F, -0.0F, 0.0F);
        this.Upperknob8 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob8.setRotationPoint(-1.0F, 0.1F, -4.1F);
        this.Upperknob8.addBox(0.0F, -3.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Upperknob8, -0.26790804018112957F, -0.0F, 0.0F);
        this.FlukeSection3 = new MowzieModelRenderer(this, 33, 0);
        this.FlukeSection3.setRotationPoint(0.0F, 1.9F, 21.4F);
        this.FlukeSection3.addBox(-1.0F, -4.0F, 0.0F, 2, 13, 15, 0.0F);
        this.setRotateAngle(FlukeSection3, -0.14800392056911915F, -0.0F, 0.0F);
        this.Lowerknob3 = new MowzieModelRenderer(this, 0, 0);
        this.Lowerknob3.setRotationPoint(-0.5F, 8.3F, 11.3F);
        this.Lowerknob3.addBox(0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Lowerknob3, -2.906496803346157F, -0.0F, 0.0F);
        this.Upperknob10 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob10.setRotationPoint(-1.0F, 0.5F, 0.1F);
        this.Upperknob10.addBox(0.0F, -3.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Upperknob10, -0.17034413499464657F, -0.0F, 0.0F);
        this.Innerteeth = new MowzieModelRenderer(this, 165, 95);
        this.Innerteeth.setRotationPoint(-2.0F, 5.0F, -7.0F);
        this.Innerteeth.addBox(0.0F, 0.0F, 0.0F, 5, 1, 14, 0.0F);
        this.Neckback4 = new MowzieModelRenderer(this, 129, 51);
        this.Neckback4.setRotationPoint(0.0F, 0.7F, 10.1F);
        this.Neckback4.addBox(-4.5F, -1.33F, -8.3F, 9, 3, 12, 0.0F);
        this.setRotateAngle(Neckback4, -0.14486232791552936F, -0.0F, 0.0F);
        this.Upperknob21 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob21.setRotationPoint(-0.5F, -4.0F, 3.0F);
        this.Upperknob21.addBox(0.0F, -3.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Upperknob21, -0.07644542123735162F, -0.0F, 0.0F);
        this.FlukeSection8 = new MowzieModelRenderer(this, 108, 23);
        this.FlukeSection8.setRotationPoint(0.0F, 2.9F, 0.2F);
        this.FlukeSection8.addBox(-1.0F, -4.2F, -21.0F, 2, 4, 21, 0.0F);
        this.setRotateAngle(FlukeSection8, -2.955366022401998F, -0.0F, 0.0F);
        this.Upperknob6 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob6.setRotationPoint(-1.0F, 0.5F, -7.8F);
        this.Upperknob6.addBox(0.0F, -3.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Upperknob6, -0.045553093477052F, -0.0F, 0.0F);
        this.TailSection4 = new MowzieModelRenderer(this, 131, 171);
        this.TailSection4.setRotationPoint(0.0F, 0.6F, 18.7F);
        this.TailSection4.addBox(-2.0F, 0.0F, 0.0F, 4, 7, 15, 0.0F);
        this.setRotateAngle(TailSection4, -0.007330382858376183F, -0.0F, 0.0F);
        this.Upperknob4 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob4.setRotationPoint(-1.0F, 0.4F, -2.5F);
        this.Upperknob4.addBox(0.0F, -3.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Upperknob4, -0.23684117949563052F, -0.0F, 0.0F);
        this.LeftFrontFlipper = new MowzieModelRenderer(this, 147, 0);
        this.LeftFrontFlipper.setRotationPoint(8.3F, 8.8F, 14.6F);
        this.LeftFrontFlipper.addBox(0.0F, 0.0F, -3.0F, 8, 2, 16, 0.0F);
        this.setRotateAngle(LeftFrontFlipper, -0.296705972839036F, 1.161865683052625F, 0.0F);
        this.TailSection3 = new MowzieModelRenderer(this, 76, 166);
        this.TailSection3.setRotationPoint(0.0F, 0.5F, 7.4F);
        this.TailSection3.addBox(-3.0F, 0.0F, 0.0F, 6, 8, 20, 0.0F);
        this.setRotateAngle(TailSection3, -6.981317007977319E-4F, -0.0F, 0.0F);
        this.Upperknob22 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob22.setRotationPoint(-0.5F, -4.4F, 6.8F);
        this.Upperknob22.addBox(0.0F, -3.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Upperknob22, -0.14172073526193954F, -0.0F, 0.0F);
        this.Upperknob1 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob1.setRotationPoint(0.5F, 0.4F, 6.1F);
        this.Upperknob1.addBox(0.0F, -3.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Upperknob1, -0.5440191278466325F, -0.0F, 0.0F);
        this.LeftBackFlipper = new MowzieModelRenderer(this, 197, 25);
        this.LeftBackFlipper.setRotationPoint(4.5F, 11.5F, 15.5F);
        this.LeftBackFlipper.addBox(0.0F, 0.0F, -2.0F, 5, 1, 13, 0.0F);
        this.setRotateAngle(LeftBackFlipper, -0.296705972839036F, 0.7792895110154682F, 0.0F);
        this.Lowerknob1 = new MowzieModelRenderer(this, 0, 0);
        this.Lowerknob1.setRotationPoint(-0.5F, 7.4F, 3.4F);
        this.Lowerknob1.addBox(0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Lowerknob1, -2.9148743837557296F, -0.0F, 0.0F);
        this.BodySection1 = new MowzieModelRenderer(this, 0, 129);
        this.BodySection1.setRotationPoint(2.5F, 2.6F, 6.5F);
        this.BodySection1.addBox(-9.0F, -6.0F, 0.0F, 17, 16, 15, 0.0F);
        this.setRotateAngle(BodySection1, 0.0312413936106985F, 0.0F, 0.0F);
        this.Neck = new MowzieModelRenderer(this, 0, 93);
        this.Neck.setRotationPoint(-2.0F, 5.3F, -28.4F);
        this.Neck.addBox(-4.5F, 0.0F, 0.0F, 13, 12, 8, 0.0F);
        this.setRotateAngle(Neck, -0.024260076602721177F, -0.0F, 0.0F);
        this.Lowerknob8 = new MowzieModelRenderer(this, 0, 0);
        this.Lowerknob8.setRotationPoint(-0.5F, -6.1F, -13.0F);
        this.Lowerknob8.addBox(0.0F, -3.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Lowerknob8, -2.8070130359824805F, -0.0F, 0.0F);
        this.Upperknob25 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob25.setRotationPoint(-0.5F, -3.2F, 2.0F);
        this.Upperknob25.addBox(0.0F, -3.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Upperknob25, -0.29513517651224114F, -0.0F, 0.0F);
        this.Leftbrow = new MowzieModelRenderer(this, 168, 160);
        this.Leftbrow.setRotationPoint(2.8F, -2.1F, -15.8F);
        this.Leftbrow.addBox(0.0F, 0.0F, 0.0F, 1, 3, 17, 0.0F);
        this.setRotateAngle(Leftbrow, 0.2684316389567279F, -0.10279989294246601F, 0.9365436766201571F);
        this.Neckback1 = new MowzieModelRenderer(this, 0, 52);
        this.Neckback1.setRotationPoint(0.5F, 3.1F, -3.5F);
        this.Neckback1.addBox(-2.0F, -1.0F, 0.0F, 7, 4, 8, 0.0F);
        this.setRotateAngle(Neckback1, 0.6265732014659642F, -0.0F, 0.0F);
        this.Upperknob2 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob2.setRotationPoint(-1.0F, 0.4F, -7.0F);
        this.Upperknob2.addBox(0.0F, -3.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Upperknob2, -0.3045599544730105F, -0.0F, 0.0F);
        this.Upperknob13 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob13.setRotationPoint(-1.0F, 0.9F, -3.2F);
        this.Upperknob13.addBox(0.0F, -3.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Upperknob13, -0.29914943379182807F, -0.0F, 0.0F);
        this.Lowerknob4 = new MowzieModelRenderer(this, 0, 0);
        this.Lowerknob4.setRotationPoint(-0.5F, 7.8F, 15.0F);
        this.Lowerknob4.addBox(0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Lowerknob4, -2.8136452871400586F, -0.0F, 0.0F);
        this.RightBackFlipper = new MowzieModelRenderer(this, 150, 25);
        this.RightBackFlipper.setRotationPoint(-3.5F, 11.5F, 15.5F);
        this.RightBackFlipper.addBox(-5.0F, 0.0F, -2.0F, 5, 1, 13, 0.0F);
        this.setRotateAngle(RightBackFlipper, -0.296705972839036F, -0.7792895110154682F, 0.0F);
        this.Outerteeth = new MowzieModelRenderer(this, 200, 101);
        this.Outerteeth.setRotationPoint(-3.0F, 5.0F, -12.0F);
        this.Outerteeth.addBox(0.0F, 0.0F, 0.0F, 7, 2, 17, 0.0F);
        this.Upperknob16 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob16.setRotationPoint(-0.5F, -0.7F, 6.0F);
        this.Upperknob16.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Upperknob16, -0.14852751934471745F, -0.0F, 0.0F);
        this.FlukeSection5 = new MowzieModelRenderer(this, 104, 0);
        this.FlukeSection5.setRotationPoint(0.0F, 2.1F, 14.0F);
        this.FlukeSection5.addBox(-1.0F, -2.0F, 1.0F, 2, 5, 8, 0.0F);
        this.Mainhead = new MowzieModelRenderer(this, 40, 79);
        this.Mainhead.setRotationPoint(2.0F, 6.5F, -0.8F);
        this.Mainhead.addBox(-4.0F, -4.0F, -8.0F, 8, 5, 11, 0.0F);
        this.Upperknob18 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob18.setRotationPoint(-0.5F, -0.9F, 13.0F);
        this.Upperknob18.addBox(0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Upperknob18, -0.14852751934471745F, -0.0F, 0.0F);
        this.UpperJaw = new MowzieModelRenderer(this, 83, 76);
        this.UpperJaw.setRotationPoint(-0.5F, -4.2F, -4.5F);
        this.UpperJaw.addBox(-3.0F, 1.0F, -12.0F, 7, 4, 11, 0.0F);
        this.setRotateAngle(UpperJaw, 0.061959188445798695F, -0.0F, 0.0F);
        this.Lowerknob9 = new MowzieModelRenderer(this, 0, 0);
        this.Lowerknob9.setRotationPoint(-0.5F, -6.0F, -16.0F);
        this.Lowerknob9.addBox(0.0F, -3.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Lowerknob9, -2.615899482889101F, 0.0F, 0.0F);
        this.BodySection2 = new MowzieModelRenderer(this, 68, 127);
        this.BodySection2.setRotationPoint(-0.5F, -6.0F, 12.3F);
        this.BodySection2.addBox(-7.0F, 0.0F, 0.0F, 14, 16, 17, 0.0F);
        this.setRotateAngle(BodySection2, 0.05951572749300663F, 0.0F, 0.0F);
        this.Upperknob19 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob19.setRotationPoint(-0.5F, -0.8F, 17.2F);
        this.Upperknob19.addBox(0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Upperknob19, -0.08150687606813518F, -0.0F, 0.0F);
        this.Neckback2 = new MowzieModelRenderer(this, 38, 51);
        this.Neckback2.setRotationPoint(2.0F, -4.1F, 10.1F);
        this.Neckback2.addBox(-5.5F, -1.33F, -8.3F, 11, 4, 10, 0.0F);
        this.setRotateAngle(Neckback2, 0.33056536032772604F, 0.0F, 0.0F);
        this.FlukeSection6 = new MowzieModelRenderer(this, 132, 5);
        this.FlukeSection6.setRotationPoint(0.0F, 1.6F, 8.0F);
        this.FlukeSection6.addBox(-1.0F, -2.0F, 1.0F, 2, 2, 5, 0.0F);
        this.Neckback3 = new MowzieModelRenderer(this, 84, 52);
        this.Neckback3.setRotationPoint(-0.5F, -6.9F, 13.3F);
        this.Neckback3.addBox(-5.0F, -1.33F, -8.3F, 10, 3, 10, 0.0F);
        this.setRotateAngle(Neckback3, 0.0066322511575784525F, 0.0F, 0.0F);
        this.Lowerknob6 = new MowzieModelRenderer(this, 0, 0);
        this.Lowerknob6.setRotationPoint(-0.5F, -5.8F, -6.8F);
        this.Lowerknob6.addBox(0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Lowerknob6, -3.0867893150771715F, -0.0F, 0.0F);
        this.Chin = new MowzieModelRenderer(this, 106, 99);
        this.Chin.setRotationPoint(0.5F, -0.1F, -8.7F);
        this.Chin.addBox(-4.0F, -2.0F, -11.0F, 5, 2, 17, 0.0F);
        this.setRotateAngle(Chin, -0.08239888580665289F, -0.0F, 0.0F);
        this.Upperknob15 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob15.setRotationPoint(-0.5F, 1.5F, 11.3F);
        this.Upperknob15.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Upperknob15, -0.14852751934471745F, -0.0F, 0.0F);
        this.Upperknob11 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob11.setRotationPoint(-1.0F, 0.5F, -7.1F);
        this.Upperknob11.addBox(0.0F, -3.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Upperknob11, -0.14852751934471745F, -0.0F, 0.0F);
        this.Upperknob26 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob26.setRotationPoint(-0.5F, -3.2F, 5.2F);
        this.Upperknob26.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Upperknob26, -0.4310963252425994F, -0.0F, 0.0F);
        this.Lowerjawforward = new MowzieModelRenderer(this, 75, 95);
        this.Lowerjawforward.setRotationPoint(0.5F, 0.5F, 3.1F);
        this.Lowerjawforward.addBox(-4.0F, -3.0F, -20.0F, 6, 2, 13, 0.0F);
        this.Lowerknob10 = new MowzieModelRenderer(this, 0, 0);
        this.Lowerknob10.setRotationPoint(-0.5F, -5.9F, -18.3F);
        this.Lowerknob10.addBox(0.0F, -3.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Lowerknob10, -2.615899482889101F, -0.0F, 0.0F);
        this.Upperknob12 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob12.setRotationPoint(-1.0F, 0.6F, -5.3F);
        this.Upperknob12.addBox(0.0F, -3.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Upperknob12, -0.26895523773232616F, -0.0F, 0.0F);
        this.Upperknob14 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob14.setRotationPoint(-0.5F, 1.8F, 8.6F);
        this.Upperknob14.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Upperknob14, -0.14852751934471745F, 0.0F, 0.0F);
        this.FlukeSection7 = new MowzieModelRenderer(this, 73, 0);
        this.FlukeSection7.setRotationPoint(0.0F, -2.0F, 0.1F);
        this.FlukeSection7.addBox(-1.0F, -4.0F, 0.0F, 2, 4, 22, 0.0F);
        this.setRotateAngle(FlukeSection7, -0.2181661564992912F, -0.0F, 0.0F);
        this.FlukeSection2 = new MowzieModelRenderer(this, 57, 26);
        this.FlukeSection2.setRotationPoint(0.0F, 2.2F, 5.1F);
        this.FlukeSection2.addBox(-1.0F, -0.9F, 0.0F, 2, 4, 17, 0.0F);
        this.setRotateAngle(FlukeSection2, -0.3344050846821135F, -0.0F, 0.0F);
        this.Upperknob20 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob20.setRotationPoint(-0.5F, -3.3F, -1.1F);
        this.Upperknob20.addBox(0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Upperknob20, -0.14852751934471745F, -0.0F, 0.0F);
        this.Upperknob9 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob9.setRotationPoint(-1.0F, 0.3F, -2.1F);
        this.Upperknob9.addBox(0.0F, -3.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Upperknob9, -0.20874137853852182F, -0.0F, 0.0F);
        this.BodySection3 = new MowzieModelRenderer(this, 134, 134);
        this.BodySection3.setRotationPoint(-0.5F, 1.2F, 16.0F);
        this.BodySection3.addBox(-5.0F, -0.5F, 0.0F, 11, 14, 11, 0.0F);
        this.setRotateAngle(BodySection3, -0.03769911184307752F, -0.0F, 0.0F);
        this.Upperknob3 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob3.setRotationPoint(-1.0F, 0.3F, -4.7F);
        this.Upperknob3.addBox(0.0F, -3.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Upperknob3, -0.31381019950858047F, -0.0F, 0.0F);
        this.Upperknob5 = new MowzieModelRenderer(this, 0, 0);
        this.Upperknob5.setRotationPoint(-1.0F, 0.4F, -0.3F);
        this.Upperknob5.addBox(0.0F, -3.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Upperknob5, -0.19373154697137057F, -0.0F, 0.0F);
        this.BodySection1.addChild(this.RightFrontFlipper);
        this.Mainhead.addChild(this.Rightbrow);
        this.UpperJaw.addChild(this.UpperJawRidge);
        this.Neck.addChild(this.Lowerjawrear);
        this.FlukeSection1.addChild(this.Upperknob17);
        this.FlukeSection3.addChild(this.Lowerknob2);
        this.BodySection3.addChild(this.TailSection1);
        this.FlukeSection8.addChild(this.Lowerknob5);
        this.FlukeSection7.addChild(this.Upperknob27);
        this.FlukeSection8.addChild(this.Lowerknob7);
        this.TailSection4.addChild(this.FlukeSection1);
        this.FlukeSection3.addChild(this.Upperknob23);
        this.FlukeSection3.addChild(this.Upperknob24);
        this.Neckback3.addChild(this.Upperknob7);
        this.TailSection1.addChild(this.TailSection2);
        this.Neckback3.addChild(this.Upperknob8);
        this.FlukeSection1.addChild(this.FlukeSection3);
        this.FlukeSection3.addChild(this.Lowerknob3);
        this.Neckback3.addChild(this.Upperknob10);
        this.UpperJaw.addChild(this.Innerteeth);
        this.BodySection2.addChild(this.Neckback4);
        this.FlukeSection3.addChild(this.Upperknob21);
        this.FlukeSection5.addChild(this.FlukeSection8);
        this.Neckback3.addChild(this.Upperknob6);
        this.TailSection3.addChild(this.TailSection4);
        this.Neckback2.addChild(this.Upperknob4);
        this.BodySection1.addChild(this.LeftFrontFlipper);
        this.TailSection2.addChild(this.TailSection3);
        this.FlukeSection3.addChild(this.Upperknob22);
        this.Neckback1.addChild(this.Upperknob1);
        this.BodySection3.addChild(this.LeftBackFlipper);
        this.FlukeSection3.addChild(this.Lowerknob1);
        this.Neck.addChild(this.BodySection1);
        this.FlukeSection8.addChild(this.Lowerknob8);
        this.FlukeSection7.addChild(this.Upperknob25);
        this.Mainhead.addChild(this.Leftbrow);
        this.Neck.addChild(this.Neckback1);
        this.Neckback2.addChild(this.Upperknob2);
        this.Neckback4.addChild(this.Upperknob13);
        this.FlukeSection3.addChild(this.Lowerknob4);
        this.BodySection3.addChild(this.RightBackFlipper);
        this.UpperJaw.addChild(this.Outerteeth);
        this.FlukeSection1.addChild(this.Upperknob16);
        this.FlukeSection3.addChild(this.FlukeSection5);
        this.Neck.addChild(this.Mainhead);
        this.FlukeSection1.addChild(this.Upperknob18);
        this.Mainhead.addChild(this.UpperJaw);
        this.FlukeSection8.addChild(this.Lowerknob9);
        this.BodySection1.addChild(this.BodySection2);
        this.FlukeSection1.addChild(this.Upperknob19);
        this.Neck.addChild(this.Neckback2);
        this.FlukeSection5.addChild(this.FlukeSection6);
        this.BodySection1.addChild(this.Neckback3);
        this.FlukeSection8.addChild(this.Lowerknob6);
        this.Lowerjawforward.addChild(this.Chin);
        this.TailSection3.addChild(this.Upperknob15);
        this.Neckback4.addChild(this.Upperknob11);
        this.FlukeSection7.addChild(this.Upperknob26);
        this.Lowerjawrear.addChild(this.Lowerjawforward);
        this.FlukeSection8.addChild(this.Lowerknob10);
        this.Neckback4.addChild(this.Upperknob12);
        this.TailSection3.addChild(this.Upperknob14);
        this.FlukeSection5.addChild(this.FlukeSection7);
        this.FlukeSection1.addChild(this.FlukeSection2);
        this.FlukeSection3.addChild(this.Upperknob20);
        this.Neckback3.addChild(this.Upperknob9);
        this.BodySection2.addChild(this.BodySection3);
        this.Neckback2.addChild(this.Upperknob3);
        this.Neckback2.addChild(this.Upperknob5);

        this.updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Neck.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float rotation, float rotationYaw, float rotationPitch, float partialTicks, Entity entity) {
        this.resetToDefaultPose();

        float scaleFactor = 0.3F;
        this.bodyParts = new MowzieModelRenderer[] { Mainhead, Neck, BodySection1, BodySection2, BodySection3, TailSection1, TailSection2, TailSection3, TailSection4, FlukeSection2, FlukeSection3, FlukeSection6 };
        chainSwing(bodyParts, 1F * scaleFactor, 0.2F, -3, f, f1);
        Mainhead.rotationPointX -= 6 * f1 * Math.sin(f * scaleFactor);
        walk(RightFrontFlipper, 1 * scaleFactor, 0.6F, false, 0F, 0F, f, f1);
        walk(LeftFrontFlipper, 1 * scaleFactor, 0.6F, false, 0F, 0F, f, f1);
        walk(LeftBackFlipper, 1 * scaleFactor, 0.6F, false, -1F, 0F, f, f1);
        walk(RightBackFlipper, 1 * scaleFactor, 0.6F, false, -1F, 0F, f, f1);

        int ticksExisted = entity.ticksExisted;

        bob(Mainhead, 0.25F * scaleFactor, 5F, false, ticksExisted, 0.1F);

        walk(RightFrontFlipper, 0.25F * scaleFactor, 1.5F, false, 0F, 0F, ticksExisted, 0.1F);
        walk(LeftFrontFlipper, 0.25F * scaleFactor, 1.5F, false, 0F, 0F, ticksExisted, 0.1F);
        walk(LeftBackFlipper, 0.25F * scaleFactor, 1.5F, false, -1F, 0F, ticksExisted, 0.1F);
        walk(RightBackFlipper, 0.25F * scaleFactor, 1.5F, false, -1F, 0F, ticksExisted, 0.1F);

        ((EntityTylosaurus) entity).tailBuffer.applyChainSwingBuffer(this.bodyParts);
    }
}
