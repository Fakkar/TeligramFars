.class public Lorg/pouyadr/Pouya/Models/Theme;
.super Ljava/lang/Object;
.source "Theme.java"


# static fields
.field public static final BLUE:Ljava/lang/String; = "blue"

.field public static final GREY:Ljava/lang/String; = "grey"

.field public static final NORMAL:Ljava/lang/String; = "normal"

.field public static final SELECTED:Ljava/lang/String; = "selected"


# instance fields
.field private Floatingbuttondrawble:I

.field private TabsIconNormal:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private TabsIconSelected:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private actionbarcolor:I

.field private id:I

.field private name:Ljava/lang/String;

.field private tabLayoutColor:I


# direct methods
.method public constructor <init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V
    .registers 9
    .param p1, "id"    # I
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "actionbarcolor"    # I
    .param p4, "tabLayoutColor"    # I
    .param p5, "floatingbuttondrawble"    # I
    .param p6, "icontheme"    # Ljava/lang/String;
    .param p7, "iconthemeselected"    # Ljava/lang/String;

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput p1, p0, Lorg/pouyadr/Pouya/Models/Theme;->id:I

    .line 37
    iput-object p2, p0, Lorg/pouyadr/Pouya/Models/Theme;->name:Ljava/lang/String;

    .line 38
    iput p3, p0, Lorg/pouyadr/Pouya/Models/Theme;->actionbarcolor:I

    .line 39
    iput p4, p0, Lorg/pouyadr/Pouya/Models/Theme;->tabLayoutColor:I

    .line 40
    iput p5, p0, Lorg/pouyadr/Pouya/Models/Theme;->Floatingbuttondrawble:I

    .line 41
    invoke-direct {p0, p6}, Lorg/pouyadr/Pouya/Models/Theme;->selecticontheme(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lorg/pouyadr/Pouya/Models/Theme;->TabsIconNormal:Ljava/util/ArrayList;

    .line 42
    invoke-direct {p0, p7}, Lorg/pouyadr/Pouya/Models/Theme;->selecticontheme(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lorg/pouyadr/Pouya/Models/Theme;->TabsIconSelected:Ljava/util/ArrayList;

    .line 43
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;IIILjava/util/ArrayList;Ljava/util/ArrayList;)V
    .registers 8
    .param p1, "id"    # I
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "actionbarcolor"    # I
    .param p4, "tabLayoutColor"    # I
    .param p5, "floatingbuttondrawble"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "III",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 25
    .local p6, "tabsIconNormal":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    .local p7, "tabsIconSelected":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput p1, p0, Lorg/pouyadr/Pouya/Models/Theme;->id:I

    .line 27
    iput-object p2, p0, Lorg/pouyadr/Pouya/Models/Theme;->name:Ljava/lang/String;

    .line 28
    iput p3, p0, Lorg/pouyadr/Pouya/Models/Theme;->actionbarcolor:I

    .line 29
    iput p4, p0, Lorg/pouyadr/Pouya/Models/Theme;->tabLayoutColor:I

    .line 30
    iput p5, p0, Lorg/pouyadr/Pouya/Models/Theme;->Floatingbuttondrawble:I

    .line 31
    iput-object p6, p0, Lorg/pouyadr/Pouya/Models/Theme;->TabsIconNormal:Ljava/util/ArrayList;

    .line 32
    iput-object p7, p0, Lorg/pouyadr/Pouya/Models/Theme;->TabsIconSelected:Ljava/util/ArrayList;

    .line 33
    return-void
.end method

.method private selecticontheme(Ljava/lang/String;)Ljava/util/ArrayList;
    .registers 5
    .param p1, "themeoftabicon"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .local v0, "icons":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    const/4 v1, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_14c

    :cond_d
    :goto_d
    packed-switch v1, :pswitch_data_15a

    .line 76
    const v1, 0x7f020179

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    const v1, 0x7f02017d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    const v1, 0x7f020189

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    const v1, 0x7f020181

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    const v1, 0x7f020185

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    const v1, 0x7f020175

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    const v1, 0x7f020101

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    :goto_56
    return-object v0

    .line 47
    :sswitch_57
    const-string v2, "selected"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/4 v1, 0x0

    goto :goto_d

    :sswitch_61
    const-string v2, "grey"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/4 v1, 0x1

    goto :goto_d

    :sswitch_6b
    const-string v2, "blue"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/4 v1, 0x2

    goto :goto_d

    .line 49
    :pswitch_75
    const v1, 0x7f02017c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    const v1, 0x7f020180

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    const v1, 0x7f02018c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    const v1, 0x7f020184

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    const v1, 0x7f020188

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    const v1, 0x7f020178

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    const v1, 0x7f020100

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_56

    .line 58
    :pswitch_bc
    const v1, 0x7f02017b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    const v1, 0x7f02017f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    const v1, 0x7f02018b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    const v1, 0x7f020183

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    const v1, 0x7f020187

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    const v1, 0x7f020177

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    const v1, 0x7f02018e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_56

    .line 67
    :pswitch_104
    const v1, 0x7f02017a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    const v1, 0x7f02017e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    const v1, 0x7f02018a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    const v1, 0x7f020182

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    const v1, 0x7f020186

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    const v1, 0x7f020176

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    const v1, 0x7f02018d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_56

    .line 47
    :sswitch_data_14c
    .sparse-switch
        0x2e305a -> :sswitch_6b
        0x308adf -> :sswitch_61
        0x4705f29b -> :sswitch_57
    .end sparse-switch

    :pswitch_data_15a
    .packed-switch 0x0
        :pswitch_75
        :pswitch_bc
        :pswitch_104
    .end packed-switch
.end method


# virtual methods
.method public getActionbarcolor()I
    .registers 2

    .prologue
    .line 104
    iget v0, p0, Lorg/pouyadr/Pouya/Models/Theme;->actionbarcolor:I

    return v0
.end method

.method public getFloatingbuttondrawble()I
    .registers 2

    .prologue
    .line 120
    iget v0, p0, Lorg/pouyadr/Pouya/Models/Theme;->Floatingbuttondrawble:I

    return v0
.end method

.method public getId()I
    .registers 2

    .prologue
    .line 88
    iget v0, p0, Lorg/pouyadr/Pouya/Models/Theme;->id:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .registers 2

    .prologue
    .line 96
    iget-object v0, p0, Lorg/pouyadr/Pouya/Models/Theme;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getTabLayoutColor()I
    .registers 2

    .prologue
    .line 112
    iget v0, p0, Lorg/pouyadr/Pouya/Models/Theme;->tabLayoutColor:I

    return v0
.end method

.method public getTabsIconNormal()Ljava/util/ArrayList;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 128
    iget-object v0, p0, Lorg/pouyadr/Pouya/Models/Theme;->TabsIconNormal:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getTabsIconSelected()Ljava/util/ArrayList;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 136
    iget-object v0, p0, Lorg/pouyadr/Pouya/Models/Theme;->TabsIconSelected:Ljava/util/ArrayList;

    return-object v0
.end method

.method public setActionbarcolor(I)V
    .registers 2
    .param p1, "actionbarcolor"    # I

    .prologue
    .line 108
    iput p1, p0, Lorg/pouyadr/Pouya/Models/Theme;->actionbarcolor:I

    .line 109
    return-void
.end method

.method public setFloatingbuttondrawble(I)V
    .registers 2
    .param p1, "floatingbuttondrawble"    # I

    .prologue
    .line 124
    iput p1, p0, Lorg/pouyadr/Pouya/Models/Theme;->Floatingbuttondrawble:I

    .line 125
    return-void
.end method

.method public setId(I)V
    .registers 2
    .param p1, "id"    # I

    .prologue
    .line 92
    iput p1, p0, Lorg/pouyadr/Pouya/Models/Theme;->id:I

    .line 93
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .registers 2
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 100
    iput-object p1, p0, Lorg/pouyadr/Pouya/Models/Theme;->name:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public setTabLayoutColor(I)V
    .registers 2
    .param p1, "tabLayoutColor"    # I

    .prologue
    .line 116
    iput p1, p0, Lorg/pouyadr/Pouya/Models/Theme;->tabLayoutColor:I

    .line 117
    return-void
.end method

.method public setTabsIconNormal(Ljava/util/ArrayList;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 132
    .local p1, "tabsIconNormal":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    iput-object p1, p0, Lorg/pouyadr/Pouya/Models/Theme;->TabsIconNormal:Ljava/util/ArrayList;

    .line 133
    return-void
.end method

.method public setTabsIconSelected(Ljava/util/ArrayList;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 140
    .local p1, "tabsIconSelected":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    iput-object p1, p0, Lorg/pouyadr/Pouya/Models/Theme;->TabsIconSelected:Ljava/util/ArrayList;

    .line 141
    return-void
.end method
