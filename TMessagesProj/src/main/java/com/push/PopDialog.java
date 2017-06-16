.class public Lorg/pouyadr/push/PopDialog;
.super Landroid/app/Activity;
.source "PopDialog.java"


# instance fields
.field ButtonLink:Ljava/lang/String;

.field ButtonText:Ljava/lang/String;

.field ImageLink:Ljava/lang/String;

.field MainText:Landroid/widget/TextView;

.field MatnText:Ljava/lang/String;

.field Open:Landroid/widget/Button;

.field Title:Landroid/widget/TextView;

.field TxtTitle:Ljava/lang/String;

.field bazzar:Ljava/lang/String;

.field img:Landroid/widget/ImageView;

.field market:Ljava/lang/String;

.field final telegram:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 28
    const-string v0, "com.farsitel.bazaar"

    iput-object v0, p0, Lorg/pouyadr/push/PopDialog;->bazzar:Ljava/lang/String;

    .line 31
    const-string v0, "org.telegram.messenger"

    iput-object v0, p0, Lorg/pouyadr/push/PopDialog;->telegram:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public Close(Landroid/view/View;)V
    .registers 3
    .param p1, "paramView"    # Landroid/view/View;

    .prologue
    .line 35
    :try_start_0
    invoke-virtual {p0}, Lorg/pouyadr/push/PopDialog;->finish()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_3} :catch_4

    .line 40
    :goto_3
    return-void

    .line 38
    :catch_4
    move-exception v0

    goto :goto_3
.end method

.method public Open(Landroid/view/View;)V
    .registers 6
    .param p1, "paramView"    # Landroid/view/View;

    .prologue
    .line 43
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    iget-object v3, p0, Lorg/pouyadr/push/PopDialog;->ButtonLink:Ljava/lang/String;

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 47
    .local v1, "localIntent1":Landroid/content/Intent;
    :try_start_d
    iget-object v2, p0, Lorg/pouyadr/push/PopDialog;->market:Ljava/lang/String;

    const-string v3, "telegram"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_22

    .line 48
    const-string v2, "org.telegram.messenger"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    invoke-virtual {p0, v1}, Lorg/pouyadr/push/PopDialog;->startActivity(Landroid/content/Intent;)V

    .line 51
    invoke-virtual {p0}, Lorg/pouyadr/push/PopDialog;->finish()V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_22} :catch_23

    .line 66
    :cond_22
    :goto_22
    return-void

    .line 55
    :catch_23
    move-exception v0

    .line 60
    .local v0, "localException":Ljava/lang/Exception;
    invoke-virtual {p0, v1}, Lorg/pouyadr/push/PopDialog;->startActivity(Landroid/content/Intent;)V

    .line 61
    invoke-virtual {p0}, Lorg/pouyadr/push/PopDialog;->finish()V

    goto :goto_22
.end method

.method public onBackPressed()V
    .registers 1

    .prologue
    .line 69
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 5
    .param p1, "paramBundle"    # Landroid/os/Bundle;

    .prologue
    .line 72
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 73
    invoke-virtual {p0}, Lorg/pouyadr/push/PopDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    .line 74
    const v0, 0x7f040019

    invoke-virtual {p0, v0}, Lorg/pouyadr/push/PopDialog;->setContentView(I)V

    .line 75
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/pouyadr/push/PopDialog;->setFinishOnTouchOutside(Z)V

    .line 76
    const v0, 0x7f0f0074

    invoke-virtual {p0, v0}, Lorg/pouyadr/push/PopDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lorg/pouyadr/push/PopDialog;->Title:Landroid/widget/TextView;

    .line 77
    const v0, 0x7f0f0077

    invoke-virtual {p0, v0}, Lorg/pouyadr/push/PopDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lorg/pouyadr/push/PopDialog;->MainText:Landroid/widget/TextView;

    .line 78
    const v0, 0x7f0f0076

    invoke-virtual {p0, v0}, Lorg/pouyadr/push/PopDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lorg/pouyadr/push/PopDialog;->img:Landroid/widget/ImageView;

    .line 79
    const v0, 0x7f0f0078

    invoke-virtual {p0, v0}, Lorg/pouyadr/push/PopDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lorg/pouyadr/push/PopDialog;->Open:Landroid/widget/Button;

    .line 80
    invoke-virtual {p0}, Lorg/pouyadr/push/PopDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "Title"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/pouyadr/push/PopDialog;->TxtTitle:Ljava/lang/String;

    .line 81
    invoke-virtual {p0}, Lorg/pouyadr/push/PopDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "Matn"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/pouyadr/push/PopDialog;->MatnText:Ljava/lang/String;

    .line 82
    invoke-virtual {p0}, Lorg/pouyadr/push/PopDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "ImageLink"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/pouyadr/push/PopDialog;->ImageLink:Ljava/lang/String;

    .line 83
    invoke-virtual {p0}, Lorg/pouyadr/push/PopDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "ButtonLink"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/pouyadr/push/PopDialog;->ButtonLink:Ljava/lang/String;

    .line 84
    invoke-virtual {p0}, Lorg/pouyadr/push/PopDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "ButtonText"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/pouyadr/push/PopDialog;->ButtonText:Ljava/lang/String;

    .line 85
    invoke-static {p0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    iget-object v1, p0, Lorg/pouyadr/push/PopDialog;->ImageLink:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v1, p0, Lorg/pouyadr/push/PopDialog;->img:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    .line 86
    iget-object v0, p0, Lorg/pouyadr/push/PopDialog;->Title:Landroid/widget/TextView;

    iget-object v1, p0, Lorg/pouyadr/push/PopDialog;->TxtTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    iget-object v0, p0, Lorg/pouyadr/push/PopDialog;->MainText:Landroid/widget/TextView;

    iget-object v1, p0, Lorg/pouyadr/push/PopDialog;->MatnText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    iget-object v0, p0, Lorg/pouyadr/push/PopDialog;->MainText:Landroid/widget/TextView;

    const/high16 v1, 0x41a00000    # 20.0f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 89
    iget-object v0, p0, Lorg/pouyadr/push/PopDialog;->MainText:Landroid/widget/TextView;

    new-instance v1, Landroid/text/method/ScrollingMovementMethod;

    invoke-direct {v1}, Landroid/text/method/ScrollingMovementMethod;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 90
    iget-object v0, p0, Lorg/pouyadr/push/PopDialog;->Open:Landroid/widget/Button;

    iget-object v1, p0, Lorg/pouyadr/push/PopDialog;->ButtonText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 91
    invoke-virtual {p0}, Lorg/pouyadr/push/PopDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "market"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/pouyadr/push/PopDialog;->market:Ljava/lang/String;

    .line 92
    return-void
.end method
