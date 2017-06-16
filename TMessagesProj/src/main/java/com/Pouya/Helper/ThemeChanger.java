.class public Lorg/pouyadr/Pouya/Helper/ThemeChanger;
.super Ljava/lang/Object;
.source "ThemeChanger.java"


# static fields
.field private static TabHost:Landroid/view/View;

.field private static currenttheme:Lorg/pouyadr/Pouya/Models/Theme;

.field private static floatingbutton:Landroid/widget/ImageView;

.field private static themes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/pouyadr/Pouya/Models/Theme;",
            ">;"
        }
    .end annotation
.end field

.field private static views:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .prologue
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->views:Ljava/util/ArrayList;

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ChangeTheme(Lorg/pouyadr/Pouya/Models/Theme;)V
    .registers 4
    .param p0, "theme"    # Lorg/pouyadr/Pouya/Models/Theme;

    .prologue
    .line 66
    invoke-static {p0}, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->setcurrent(Lorg/pouyadr/Pouya/Models/Theme;)V

    .line 67
    invoke-static {}, Lorg/pouyadr/ui/ActionBar/ActionBar;->ChangeColor()V

    .line 69
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_7
    sget-object v1, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->views:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2d

    .line 70
    sget-object v1, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->views:Ljava/util/ArrayList;

    if-nez v1, :cond_1d

    .line 71
    sget-object v1, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->views:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 72
    add-int/lit8 v0, v0, -0x1

    .line 69
    :goto_1a
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    .line 75
    :cond_1d
    sget-object v1, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->views:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/Models/Theme;->getActionbarcolor()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_1a

    .line 79
    :cond_2d
    sget-object v1, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->TabHost:Landroid/view/View;

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/Models/Theme;->getTabLayoutColor()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 80
    sget-object v1, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->floatingbutton:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/Models/Theme;->getFloatingbuttondrawble()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 81
    return-void
.end method

.method public static EditActionbar(Landroid/view/View;)V
    .registers 2
    .param p0, "actionbar"    # Landroid/view/View;

    .prologue
    .line 83
    invoke-static {}, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->getcurrent()Lorg/pouyadr/Pouya/Models/Theme;

    move-result-object v0

    invoke-virtual {v0}, Lorg/pouyadr/Pouya/Models/Theme;->getActionbarcolor()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 84
    return-void
.end method

.method public static LoadThemes()Ljava/util/ArrayList;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lorg/pouyadr/Pouya/Models/Theme;",
            ">;"
        }
    .end annotation

    .prologue
    const v11, 0x7f0200dd

    const v10, 0x7f0200d0

    const v3, -0xad825d

    .line 40
    sget-object v0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    if-eqz v0, :cond_18

    sget-object v0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_18

    sget-object v0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    .line 63
    .local v8, "d":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    :goto_17
    return-object v0

    .line 41
    .end local v8    # "d":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    :cond_18
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .restart local v8    # "d":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/4 v1, 0x0

    const-string v2, "Blue"

    const v5, 0x7f0200e7

    const-string v6, "normal"

    const-string v7, "selected"

    move v4, v3

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/4 v1, 0x1

    const-string v2, "HotBlue"

    const-string v3, "#0C867B"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#0C867B"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200e2

    const-string v6, "normal"

    const-string v7, "selected"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/4 v1, 0x2

    const-string v2, "cyan"

    const-string v3, "#00BCD4"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#00BCD4"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200d4

    const-string v6, "normal"

    const-string v7, "selected"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/4 v1, 0x3

    const-string v2, "Hotgreen"

    const-string v3, "#0C867B"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#0C867B"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200e1

    const-string v6, "normal"

    const-string v7, "selected"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/4 v1, 0x4

    const-string v2, "green"

    const-string v3, "#9CCC65"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#9CCC65"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200d6

    const-string v6, "normal"

    const-string v7, "selected"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/4 v1, 0x5

    const-string v2, "lightgreen"

    const-string v3, "#8BC34A"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#8BC34A"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200d8

    const-string v6, "normal"

    const-string v7, "selected"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/4 v1, 0x6

    const-string v2, "bluegreen"

    const-string v3, "#10AA9C"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#10AA9C"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200d5

    const-string v6, "normal"

    const-string v7, "selected"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/4 v1, 0x7

    const-string v2, "lemun"

    const-string v3, "#FFF568"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#FFF568"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200e4

    const-string v6, "grey"

    const-string v7, "blue"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/16 v1, 0x8

    const-string v2, "ping"

    const-string v3, "#EC407A"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#EC407A"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const-string v6, "normal"

    const-string v7, "selected"

    move v5, v11

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/16 v1, 0x9

    const-string v2, "Red"

    const-string v3, "#F44336"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#F44336"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200e6

    const-string v6, "normal"

    const-string v7, "selected"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/16 v1, 0xa

    const-string v2, "LightRed"

    const-string v3, "#E57373"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#E57373"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200e5

    const-string v6, "normal"

    const-string v7, "selected"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/16 v1, 0xb

    const-string v2, "purple"

    const-string v3, "#AB47BC"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#AB47BC"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200d9

    const-string v6, "normal"

    const-string v7, "selected"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/16 v1, 0xc

    const-string v2, "Brown"

    const-string v3, "#795548"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#795548"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200d2

    const-string v6, "normal"

    const-string v7, "selected"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/16 v1, 0xd

    const-string v2, "Dark"

    const-string v3, "#3C3F41"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#3C3F41"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200d1

    const-string v6, "normal"

    const-string v7, "selected"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/16 v1, 0xe

    const-string v2, "black"

    const-string v3, "#000000"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#000000"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200e0

    const-string v6, "normal"

    const-string v7, "selected"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/16 v1, 0xf

    const-string v2, "bluegreen"

    const-string v3, "#005926"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#005B7E"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const-string v6, "normal"

    const-string v7, "selected"

    move v5, v10

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/16 v1, 0x10

    const-string v2, "pinkred"

    const-string v3, "#ED145B"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#EE1C25"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200de

    const-string v6, "normal"

    const-string v7, "selected"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/16 v1, 0x11

    const-string v2, "orangered"

    const-string v3, "#F8941D"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#EE1C25"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f0200db

    const-string v6, "normal"

    const-string v7, "selected"

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/16 v1, 0x12

    const-string v2, "bluegreen"

    const-string v3, "#00BCD4"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#9CCC65"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const-string v6, "normal"

    const-string v7, "selected"

    move v5, v10

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    sget-object v9, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    new-instance v0, Lorg/pouyadr/Pouya/Models/Theme;

    const/16 v1, 0x13

    const-string v2, "hotbluegreen"

    const-string v3, "#d23a77"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#d23a77"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const-string v6, "normal"

    const-string v7, "selected"

    move v5, v11

    invoke-direct/range {v0 .. v7}, Lorg/pouyadr/Pouya/Models/Theme;-><init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    sget-object v0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    goto/16 :goto_17
.end method

.method public static addView(Landroid/view/View;)V
    .registers 2
    .param p0, "view"    # Landroid/view/View;

    .prologue
    .line 37
    sget-object v0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->views:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    return-void
.end method

.method public static getcurrent()Lorg/pouyadr/Pouya/Models/Theme;
    .registers 2

    .prologue
    .line 29
    sget-object v0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->currenttheme:Lorg/pouyadr/Pouya/Models/Theme;

    if-eqz v0, :cond_c

    sget-object v0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1d

    .line 30
    :cond_c
    invoke-static {}, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->LoadThemes()Ljava/util/ArrayList;

    .line 31
    sget-object v0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->themes:Ljava/util/ArrayList;

    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->getTheme()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/pouyadr/Pouya/Models/Theme;

    sput-object v0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->currenttheme:Lorg/pouyadr/Pouya/Models/Theme;

    .line 34
    :cond_1d
    sget-object v0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->currenttheme:Lorg/pouyadr/Pouya/Models/Theme;

    return-object v0
.end method

.method public static setFloatingbutton(Landroid/widget/ImageView;)V
    .registers 1
    .param p0, "floatingbutton"    # Landroid/widget/ImageView;

    .prologue
    .line 87
    sput-object p0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->floatingbutton:Landroid/widget/ImageView;

    .line 88
    return-void
.end method

.method public static setcurrent(Lorg/pouyadr/Pouya/Models/Theme;)V
    .registers 2
    .param p0, "t"    # Lorg/pouyadr/Pouya/Models/Theme;

    .prologue
    .line 25
    sput-object p0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->currenttheme:Lorg/pouyadr/Pouya/Models/Theme;

    .line 26
    invoke-virtual {p0}, Lorg/pouyadr/Pouya/Models/Theme;->getId()I

    move-result v0

    invoke-static {v0}, Lorg/pouyadr/Pouya/Setting/Setting;->setTheme(I)V

    .line 27
    return-void
.end method

.method public static settabhost(Landroid/support/design/widget/TabLayout;)V
    .registers 1
    .param p0, "tabhost"    # Landroid/support/design/widget/TabLayout;

    .prologue
    .line 91
    sput-object p0, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->TabHost:Landroid/view/View;

    .line 92
    return-void
.end method
