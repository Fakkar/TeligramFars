.class public Lorg/pouyadr/Pouya/Activity/SelectColorActivity;
.super Landroid/support/v7/app/ActionBarActivity;
.source "SelectColorActivity.java"


# instance fields
.field gridview:Landroid/widget/GridView;


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 14
    invoke-direct {p0}, Landroid/support/v7/app/ActionBarActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .registers 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 18
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarActivity;->onCreate(Landroid/os/Bundle;)V

    .line 19
    const v0, 0x7f04001b

    invoke-virtual {p0, v0}, Lorg/pouyadr/Pouya/Activity/SelectColorActivity;->setContentView(I)V

    .line 20
    const v0, 0x7f0f0086

    invoke-virtual {p0, v0}, Lorg/pouyadr/Pouya/Activity/SelectColorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lorg/pouyadr/Pouya/Activity/SelectColorActivity;->gridview:Landroid/widget/GridView;

    .line 21
    iget-object v0, p0, Lorg/pouyadr/Pouya/Activity/SelectColorActivity;->gridview:Landroid/widget/GridView;

    new-instance v1, Lorg/pouyadr/Pouya/Adapter/SelectColorAdapter;

    invoke-direct {v1, p0}, Lorg/pouyadr/Pouya/Adapter/SelectColorAdapter;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 22
    const-string v0, "Themes"

    const v1, 0x7f08043a

    invoke-static {v0, v1}, Lorg/pouyadr/messenger/LocaleController;->getString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/pouyadr/Pouya/Activity/SelectColorActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 23
    iget-object v0, p0, Lorg/pouyadr/Pouya/Activity/SelectColorActivity;->gridview:Landroid/widget/GridView;

    new-instance v1, Lorg/pouyadr/Pouya/Activity/SelectColorActivity$1;

    invoke-direct {v1, p0}, Lorg/pouyadr/Pouya/Activity/SelectColorActivity$1;-><init>(Lorg/pouyadr/Pouya/Activity/SelectColorActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 30
    return-void
.end method
