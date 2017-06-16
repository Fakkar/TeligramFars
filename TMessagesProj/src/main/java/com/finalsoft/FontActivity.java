.class public Lorg/pouyadr/finalsoft/FontActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "FontActivity.java"


# instance fields
.field fonts:Lorg/pouyadr/finalsoft/Fonts;


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 11
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public SaveFontClickListener(Landroid/view/View;)V
    .registers 6
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 64
    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    .line 65
    .local v0, "txt":Landroid/widget/TextView;
    iget-object v1, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fonts/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".ttf"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/pouyadr/finalsoft/Fonts;->saveCurrentFont(Ljava/lang/String;)V

    .line 66
    const-string v1, "\u0641\u0648\u0646\u062a \u062a\u063a\u06cc\u06cc\u0631 \u06a9\u0631\u062f\u060c \u0628\u0631\u0646\u0627\u0645\u0647 \u0631\u0627 \u062f\u0648\u0628\u0627\u0631\u0647 \u0628\u0627\u0632 \u06a9\u0646\u06cc\u062f!"

    const/4 v2, 0x0

    invoke-static {p0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 67
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 16
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 16
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 17
    const v13, 0x7f04001a

    invoke-virtual {p0, v13}, Lorg/pouyadr/finalsoft/FontActivity;->setContentView(I)V

    .line 18
    new-instance v13, Lorg/pouyadr/finalsoft/Fonts;

    invoke-direct {v13, p0}, Lorg/pouyadr/finalsoft/Fonts;-><init>(Landroid/content/Context;)V

    iput-object v13, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    .line 19
    const v13, 0x7f0f007a

    invoke-virtual {p0, v13}, Lorg/pouyadr/finalsoft/FontActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 20
    .local v0, "t1":Landroid/widget/TextView;
    const v13, 0x7f0f0080

    invoke-virtual {p0, v13}, Lorg/pouyadr/finalsoft/FontActivity;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 21
    .local v5, "t2":Landroid/widget/TextView;
    const v13, 0x7f0f0079

    invoke-virtual {p0, v13}, Lorg/pouyadr/finalsoft/FontActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 22
    .local v6, "t3":Landroid/widget/TextView;
    const v13, 0x7f0f007c

    invoke-virtual {p0, v13}, Lorg/pouyadr/finalsoft/FontActivity;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 23
    .local v7, "t4":Landroid/widget/TextView;
    const v13, 0x7f0f007d

    invoke-virtual {p0, v13}, Lorg/pouyadr/finalsoft/FontActivity;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    .line 24
    .local v8, "t5":Landroid/widget/TextView;
    const v13, 0x7f0f007b

    invoke-virtual {p0, v13}, Lorg/pouyadr/finalsoft/FontActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    .line 25
    .local v9, "t6":Landroid/widget/TextView;
    const v13, 0x7f0f007f

    invoke-virtual {p0, v13}, Lorg/pouyadr/finalsoft/FontActivity;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    .line 26
    .local v10, "t7":Landroid/widget/TextView;
    const v13, 0x7f0f0081

    invoke-virtual {p0, v13}, Lorg/pouyadr/finalsoft/FontActivity;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    .line 27
    .local v11, "t8":Landroid/widget/TextView;
    const v13, 0x7f0f007e

    invoke-virtual {p0, v13}, Lorg/pouyadr/finalsoft/FontActivity;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/TextView;

    .line 28
    .local v12, "t9":Landroid/widget/TextView;
    const v13, 0x7f0f0082

    invoke-virtual {p0, v13}, Lorg/pouyadr/finalsoft/FontActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 29
    .local v1, "t10":Landroid/widget/TextView;
    const v13, 0x7f0f0083

    invoke-virtual {p0, v13}, Lorg/pouyadr/finalsoft/FontActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 30
    .local v2, "t11":Landroid/widget/TextView;
    const v13, 0x7f0f0084

    invoke-virtual {p0, v13}, Lorg/pouyadr/finalsoft/FontActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 31
    .local v3, "t12":Landroid/widget/TextView;
    const v13, 0x7f0f0085

    invoke-virtual {p0, v13}, Lorg/pouyadr/finalsoft/FontActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 33
    .local v4, "t13":Landroid/widget/TextView;
    iget-object v13, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    invoke-virtual {v13}, Lorg/pouyadr/finalsoft/Fonts;->Bkoodak()Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 34
    iget-object v13, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    invoke-virtual {v13}, Lorg/pouyadr/finalsoft/Fonts;->Byekan()Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 35
    iget-object v13, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    invoke-virtual {v13}, Lorg/pouyadr/finalsoft/Fonts;->IranSans()Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 36
    iget-object v13, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    invoke-virtual {v13}, Lorg/pouyadr/finalsoft/Fonts;->IranSans_Light()Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v7, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 37
    iget-object v13, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    invoke-virtual {v13}, Lorg/pouyadr/finalsoft/Fonts;->Ritalic()Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 38
    iget-object v13, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    invoke-virtual {v13}, Lorg/pouyadr/finalsoft/Fonts;->Roya()Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v9, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 39
    iget-object v13, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    invoke-virtual {v13}, Lorg/pouyadr/finalsoft/Fonts;->Rmedium()Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v10, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 40
    iget-object v13, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    invoke-virtual {v13}, Lorg/pouyadr/finalsoft/Fonts;->Yekan()Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 41
    iget-object v13, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    invoke-virtual {v13}, Lorg/pouyadr/finalsoft/Fonts;->Bkoodak()Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 42
    iget-object v13, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    invoke-virtual {v13}, Lorg/pouyadr/finalsoft/Fonts;->dastnevis()Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v1, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 43
    iget-object v13, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    invoke-virtual {v13}, Lorg/pouyadr/finalsoft/Fonts;->homa()Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 44
    iget-object v13, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    invoke-virtual {v13}, Lorg/pouyadr/finalsoft/Fonts;->afsaneh()Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 45
    iget-object v13, p0, Lorg/pouyadr/finalsoft/FontActivity;->fonts:Lorg/pouyadr/finalsoft/Fonts;

    invoke-virtual {v13}, Lorg/pouyadr/finalsoft/Fonts;->morvarid()Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 47
    const-string v13, "bkoodak"

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 48
    const-string v13, "byekan"

    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 49
    const-string v13, "iranSans"

    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 50
    const-string v13, "iransans_light"

    invoke-virtual {v7, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 51
    const-string v13, "ritalic"

    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 52
    const-string v13, "roya"

    invoke-virtual {v9, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 53
    const-string v13, "rmedium"

    invoke-virtual {v10, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 54
    const-string v13, "yekan"

    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 55
    const-string v13, "bkoodak"

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 56
    const-string v13, "dastnevis"

    invoke-virtual {v1, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 57
    const-string v13, "homa"

    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 58
    const-string v13, "afsaneh"

    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 59
    const-string v13, "morvarid"

    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 60
    return-void
.end method
