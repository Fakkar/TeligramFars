.class public Lorg/pouyadr/Pouya/Adapter/SelectColorAdapter;
.super Landroid/widget/BaseAdapter;
.source "SelectColorAdapter.java"


# instance fields
.field private mContext:Landroid/content/Context;

.field private themes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/pouyadr/Pouya/Models/Theme;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3
    .param p1, "c"    # Landroid/content/Context;

    .prologue
    .line 25
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 26
    iput-object p1, p0, Lorg/pouyadr/Pouya/Adapter/SelectColorAdapter;->mContext:Landroid/content/Context;

    .line 27
    invoke-static {}, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->LoadThemes()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lorg/pouyadr/Pouya/Adapter/SelectColorAdapter;->themes:Ljava/util/ArrayList;

    .line 28
    return-void
.end method


# virtual methods
.method public getCount()I
    .registers 2

    .prologue
    .line 32
    iget-object v0, p0, Lorg/pouyadr/Pouya/Adapter/SelectColorAdapter;->themes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .registers 3

    .prologue
    .line 20
    invoke-virtual {p0, p1}, Lorg/pouyadr/Pouya/Adapter/SelectColorAdapter;->getItem(I)Lorg/pouyadr/Pouya/Models/Theme;

    move-result-object v0

    return-object v0
.end method

.method public getItem(I)Lorg/pouyadr/Pouya/Models/Theme;
    .registers 3
    .param p1, "position"    # I

    .prologue
    .line 37
    iget-object v0, p0, Lorg/pouyadr/Pouya/Adapter/SelectColorAdapter;->themes:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/pouyadr/Pouya/Models/Theme;

    return-object v0
.end method

.method public getItemId(I)J
    .registers 4
    .param p1, "position"    # I

    .prologue
    .line 42
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 11
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    const/4 v6, -0x1

    const/high16 v5, 0x41c80000    # 25.0f

    .line 47
    new-instance v2, Landroid/widget/LinearLayout;

    iget-object v3, p0, Lorg/pouyadr/Pouya/Adapter/SelectColorAdapter;->mContext:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 48
    .local v2, "viv":Landroid/widget/LinearLayout;
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 49
    new-instance v0, Landroid/widget/ImageView;

    iget-object v3, p0, Lorg/pouyadr/Pouya/Adapter/SelectColorAdapter;->mContext:Landroid/content/Context;

    invoke-direct {v0, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 50
    .local v0, "imageView":Landroid/widget/ImageView;
    iget-object v3, p0, Lorg/pouyadr/Pouya/Adapter/SelectColorAdapter;->themes:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/pouyadr/Pouya/Models/Theme;

    invoke-virtual {v3}, Lorg/pouyadr/Pouya/Models/Theme;->getActionbarcolor()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 51
    new-instance v3, Landroid/widget/AbsListView$LayoutParams;

    invoke-static {v5}, Lorg/pouyadr/messenger/AndroidUtilities;->dp(F)I

    move-result v4

    invoke-direct {v3, v6, v4}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 52
    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 53
    new-instance v1, Landroid/widget/ImageView;

    iget-object v3, p0, Lorg/pouyadr/Pouya/Adapter/SelectColorAdapter;->mContext:Landroid/content/Context;

    invoke-direct {v1, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 54
    .local v1, "imageView2":Landroid/widget/ImageView;
    iget-object v3, p0, Lorg/pouyadr/Pouya/Adapter/SelectColorAdapter;->themes:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/pouyadr/Pouya/Models/Theme;

    invoke-virtual {v3}, Lorg/pouyadr/Pouya/Models/Theme;->getTabLayoutColor()I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 55
    new-instance v3, Landroid/widget/AbsListView$LayoutParams;

    invoke-static {v5}, Lorg/pouyadr/messenger/AndroidUtilities;->dp(F)I

    move-result v4

    invoke-direct {v3, v6, v4}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 57
    return-object v2
.end method
