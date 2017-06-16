.class public Lorg/pouyadr/Pouya/Setting/TabSetting;
.super Ljava/lang/Object;
.source "TabSetting.java"


# static fields
.field private static l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/pouyadr/Pouya/Models/TabModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static GetTabs(Landroid/support/design/widget/TabLayout;)Ljava/util/ArrayList;
    .registers 7
    .param p0, "tabHost"    # Landroid/support/design/widget/TabLayout;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/TabLayout;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/design/widget/TabLayout$Tab;",
            ">;"
        }
    .end annotation

    .prologue
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .local v2, "m":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/design/widget/TabLayout$Tab;>;"
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/TabSetting;->getTabModels()Ljava/util/ArrayList;

    move-result-object v1

    .line 17
    .local v1, "l":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/pouyadr/Pouya/Models/TabModel;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_a
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v0, v4, :cond_2b

    .line 18
    invoke-virtual {p0}, Landroid/support/design/widget/TabLayout;->newTab()Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v5

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/pouyadr/Pouya/Models/TabModel;

    invoke-virtual {v4}, Lorg/pouyadr/Pouya/Models/TabModel;->getUnselectedicon()I

    move-result v4

    invoke-virtual {v5, v4}, Landroid/support/design/widget/TabLayout$Tab;->setIcon(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v3

    .line 19
    .local v3, "t":Landroid/support/design/widget/TabLayout$Tab;
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    invoke-virtual {p0, v3}, Landroid/support/design/widget/TabLayout;->addTab(Landroid/support/design/widget/TabLayout$Tab;)V

    .line 17
    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    .line 22
    .end local v3    # "t":Landroid/support/design/widget/TabLayout$Tab;
    :cond_2b
    return-object v2
.end method

.method public static getNormalIcon(I)I
    .registers 2
    .param p0, "id"    # I

    .prologue
    .line 25
    sget-object v0, Lorg/pouyadr/Pouya/Setting/TabSetting;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/pouyadr/Pouya/Models/TabModel;

    invoke-virtual {v0}, Lorg/pouyadr/Pouya/Models/TabModel;->getUnselectedicon()I

    move-result v0

    return v0
.end method

.method public static getSelectedICon(I)I
    .registers 2
    .param p0, "id"    # I

    .prologue
    .line 28
    sget-object v0, Lorg/pouyadr/Pouya/Setting/TabSetting;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/pouyadr/Pouya/Models/TabModel;

    invoke-virtual {v0}, Lorg/pouyadr/Pouya/Models/TabModel;->getSelectedicon()I

    move-result v0

    return v0
.end method

.method public static getTabModels()Ljava/util/ArrayList;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lorg/pouyadr/Pouya/Models/TabModel;",
            ">;"
        }
    .end annotation

    .prologue
    .line 31
    sget-object v0, Lorg/pouyadr/Pouya/Setting/TabSetting;->l:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    sget-object v0, Lorg/pouyadr/Pouya/Setting/TabSetting;->l:Ljava/util/ArrayList;

    .line 42
    :goto_6
    return-object v0

    .line 32
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lorg/pouyadr/Pouya/Setting/TabSetting;->l:Ljava/util/ArrayList;

    .line 33
    sget-object v0, Lorg/pouyadr/Pouya/Setting/TabSetting;->l:Ljava/util/ArrayList;

    new-instance v1, Lorg/pouyadr/Pouya/Models/TabModel;

    const/4 v2, 0x0

    const v3, 0x7f0800a2

    invoke-direct {v1, v2, v3}, Lorg/pouyadr/Pouya/Models/TabModel;-><init>(II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    sget-object v0, Lorg/pouyadr/Pouya/Setting/TabSetting;->l:Ljava/util/ArrayList;

    new-instance v1, Lorg/pouyadr/Pouya/Models/TabModel;

    const/4 v2, 0x1

    const v3, 0x7f08042f

    invoke-direct {v1, v2, v3}, Lorg/pouyadr/Pouya/Models/TabModel;-><init>(II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    sget-object v0, Lorg/pouyadr/Pouya/Setting/TabSetting;->l:Ljava/util/ArrayList;

    new-instance v1, Lorg/pouyadr/Pouya/Models/TabModel;

    const/4 v2, 0x2

    const v3, 0x7f080435

    invoke-direct {v1, v2, v3}, Lorg/pouyadr/Pouya/Models/TabModel;-><init>(II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    sget-object v0, Lorg/pouyadr/Pouya/Setting/TabSetting;->l:Ljava/util/ArrayList;

    new-instance v1, Lorg/pouyadr/Pouya/Models/TabModel;

    const/4 v2, 0x3

    const v3, 0x7f080131

    invoke-direct {v1, v2, v3}, Lorg/pouyadr/Pouya/Models/TabModel;-><init>(II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    sget-object v0, Lorg/pouyadr/Pouya/Setting/TabSetting;->l:Ljava/util/ArrayList;

    new-instance v1, Lorg/pouyadr/Pouya/Models/TabModel;

    const/4 v2, 0x4

    const v3, 0x7f080430

    invoke-direct {v1, v2, v3}, Lorg/pouyadr/Pouya/Models/TabModel;-><init>(II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    sget-object v0, Lorg/pouyadr/Pouya/Setting/TabSetting;->l:Ljava/util/ArrayList;

    new-instance v1, Lorg/pouyadr/Pouya/Models/TabModel;

    const/4 v2, 0x5

    const v3, 0x7f08042b

    invoke-direct {v1, v2, v3}, Lorg/pouyadr/Pouya/Models/TabModel;-><init>(II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    sget-object v0, Lorg/pouyadr/Pouya/Setting/TabSetting;->l:Ljava/util/ArrayList;

    new-instance v1, Lorg/pouyadr/Pouya/Models/TabModel;

    const/4 v2, 0x6

    const v3, 0x7f08043b

    invoke-direct {v1, v2, v3}, Lorg/pouyadr/Pouya/Models/TabModel;-><init>(II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    sget-object v0, Lorg/pouyadr/Pouya/Setting/TabSetting;->l:Ljava/util/ArrayList;

    goto :goto_6
.end method
