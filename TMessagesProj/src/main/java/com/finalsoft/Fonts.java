.class public final Lorg/pouyadr/finalsoft/Fonts;
.super Ljava/lang/Object;
.source "Fonts.java"


# instance fields
.field private context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    .line 26
    return-void
.end method

.method public static CurrentFont()Ljava/lang/String;
    .registers 4

    .prologue
    .line 118
    sget-object v1, Lorg/pouyadr/messenger/ApplicationLoader;->applicationContext:Landroid/content/Context;

    const-string v2, "faragram_Fonts"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 119
    .local v0, "preferences":Landroid/content/SharedPreferences;
    const-string v1, "faragram_Font"

    const-string v2, "fonts/roya.ttf"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method private currentFont()Landroid/graphics/Typeface;
    .registers 3

    .prologue
    .line 92
    iget-object v0, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-static {}, Lorg/pouyadr/finalsoft/Fonts;->CurrentFont()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public Bkoodak()Landroid/graphics/Typeface;
    .registers 3

    .prologue
    .line 34
    iget-object v0, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/bkoodak.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public Byekan()Landroid/graphics/Typeface;
    .registers 3

    .prologue
    .line 39
    iget-object v0, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/byekan.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public IranSans()Landroid/graphics/Typeface;
    .registers 3

    .prologue
    .line 69
    iget-object v0, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/iransans.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public IranSans_Light()Landroid/graphics/Typeface;
    .registers 3

    .prologue
    .line 64
    iget-object v0, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/iransans_light.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public Ritalic()Landroid/graphics/Typeface;
    .registers 3

    .prologue
    .line 59
    iget-object v0, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/ritalic.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public Rmedium()Landroid/graphics/Typeface;
    .registers 3

    .prologue
    .line 54
    iget-object v0, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/rmedium.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public Roya()Landroid/graphics/Typeface;
    .registers 3

    .prologue
    .line 44
    iget-object v0, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/roya.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public Traffic()Landroid/graphics/Typeface;
    .registers 3

    .prologue
    .line 49
    iget-object v0, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/traffic.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public Yekan()Landroid/graphics/Typeface;
    .registers 3

    .prologue
    .line 29
    iget-object v0, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/yekan.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public afsaneh()Landroid/graphics/Typeface;
    .registers 3

    .prologue
    .line 73
    iget-object v0, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/afsaneh.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public dastnevis()Landroid/graphics/Typeface;
    .registers 3

    .prologue
    .line 78
    iget-object v0, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/dastnevis.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public homa()Landroid/graphics/Typeface;
    .registers 3

    .prologue
    .line 83
    iget-object v0, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/homa.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public morvarid()Landroid/graphics/Typeface;
    .registers 3

    .prologue
    .line 88
    iget-object v0, p0, Lorg/pouyadr/finalsoft/Fonts;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/morvarid.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public saveCurrentFont(Ljava/lang/String;)V
    .registers 7
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 111
    sget-object v2, Lorg/pouyadr/messenger/ApplicationLoader;->applicationContext:Landroid/content/Context;

    const-string v3, "faragram_Fonts"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 112
    .local v1, "preferences":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 113
    .local v0, "editor":Landroid/content/SharedPreferences$Editor;
    const-string v2, "faragram_Font"

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 114
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 115
    return-void
.end method

.method public setFontForContainer(Landroid/view/ViewGroup;)V
    .registers 5
    .param p1, "contentLayout"    # Landroid/view/ViewGroup;

    .prologue
    .line 97
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v0, v2, :cond_26

    .line 98
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 99
    .local v1, "view":Landroid/view/View;
    instance-of v2, v1, Landroid/widget/TextView;

    if-eqz v2, :cond_1b

    .line 100
    check-cast v1, Landroid/widget/TextView;

    .end local v1    # "view":Landroid/view/View;
    invoke-direct {p0}, Lorg/pouyadr/finalsoft/Fonts;->currentFont()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 97
    :cond_18
    :goto_18
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 101
    .restart local v1    # "view":Landroid/view/View;
    :cond_1b
    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_18

    .line 102
    check-cast v1, Landroid/view/ViewGroup;

    .end local v1    # "view":Landroid/view/View;
    invoke-virtual {p0, v1}, Lorg/pouyadr/finalsoft/Fonts;->setFontForContainer(Landroid/view/ViewGroup;)V
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_24} :catch_25

    goto :goto_18

    .line 104
    :catch_25
    move-exception v2

    .line 107
    :cond_26
    return-void
.end method
