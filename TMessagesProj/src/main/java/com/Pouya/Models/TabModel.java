.class public Lorg/pouyadr/Pouya/Models/TabModel;
.super Ljava/lang/Object;
.source "TabModel.java"


# instance fields
.field private id:I

.field private selectedicon:I

.field private title:I

.field private unselectedicon:I


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    return-void
.end method

.method public constructor <init>(II)V
    .registers 4
    .param p1, "id"    # I
    .param p2, "title"    # I

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput p1, p0, Lorg/pouyadr/Pouya/Models/TabModel;->id:I

    .line 25
    iput p2, p0, Lorg/pouyadr/Pouya/Models/TabModel;->title:I

    .line 26
    invoke-static {}, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->getcurrent()Lorg/pouyadr/Pouya/Models/Theme;

    move-result-object v0

    invoke-virtual {v0}, Lorg/pouyadr/Pouya/Models/Theme;->getTabsIconSelected()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lorg/pouyadr/Pouya/Models/TabModel;->selectedicon:I

    .line 27
    invoke-static {}, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->getcurrent()Lorg/pouyadr/Pouya/Models/Theme;

    move-result-object v0

    invoke-virtual {v0}, Lorg/pouyadr/Pouya/Models/Theme;->getTabsIconNormal()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lorg/pouyadr/Pouya/Models/TabModel;->unselectedicon:I

    .line 28
    return-void
.end method

.method public constructor <init>(IIII)V
    .registers 5
    .param p1, "id"    # I
    .param p2, "title"    # I
    .param p3, "unselectedicon"    # I
    .param p4, "selectedicon"    # I

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput p4, p0, Lorg/pouyadr/Pouya/Models/TabModel;->selectedicon:I

    .line 20
    iput p3, p0, Lorg/pouyadr/Pouya/Models/TabModel;->unselectedicon:I

    .line 21
    return-void
.end method


# virtual methods
.method public getId()I
    .registers 2

    .prologue
    .line 31
    iget v0, p0, Lorg/pouyadr/Pouya/Models/TabModel;->id:I

    return v0
.end method

.method public getSelectedicon()I
    .registers 2

    .prologue
    .line 47
    iget v0, p0, Lorg/pouyadr/Pouya/Models/TabModel;->selectedicon:I

    return v0
.end method

.method public getTitle()I
    .registers 2

    .prologue
    .line 39
    iget v0, p0, Lorg/pouyadr/Pouya/Models/TabModel;->title:I

    return v0
.end method

.method public getUnselectedicon()I
    .registers 2

    .prologue
    .line 55
    iget v0, p0, Lorg/pouyadr/Pouya/Models/TabModel;->unselectedicon:I

    return v0
.end method

.method public setId(I)V
    .registers 2
    .param p1, "id"    # I

    .prologue
    .line 35
    iput p1, p0, Lorg/pouyadr/Pouya/Models/TabModel;->id:I

    .line 36
    return-void
.end method

.method public setSelectedicon(I)V
    .registers 2
    .param p1, "selectedicon"    # I

    .prologue
    .line 51
    iput p1, p0, Lorg/pouyadr/Pouya/Models/TabModel;->selectedicon:I

    .line 52
    return-void
.end method

.method public setTitle(I)V
    .registers 2
    .param p1, "title"    # I

    .prologue
    .line 43
    iput p1, p0, Lorg/pouyadr/Pouya/Models/TabModel;->title:I

    .line 44
    return-void
.end method

.method public setUnselectedicon(I)V
    .registers 2
    .param p1, "unselectedicon"    # I

    .prologue
    .line 59
    iput p1, p0, Lorg/pouyadr/Pouya/Models/TabModel;->unselectedicon:I

    .line 60
    return-void
.end method
