.class public Lorg/pouyadr/push/Pushtelegram;
.super Landroid/app/Activity;
.source "Pushtelegram.java"


# instance fields
.field PushLink:Ljava/lang/String;

.field market:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 9
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .registers 6
    .param p1, "paramBundle"    # Landroid/os/Bundle;

    .prologue
    .line 14
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 15
    invoke-virtual {p0}, Lorg/pouyadr/push/Pushtelegram;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "PushLink"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lorg/pouyadr/push/Pushtelegram;->PushLink:Ljava/lang/String;

    .line 16
    invoke-virtual {p0}, Lorg/pouyadr/push/Pushtelegram;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "market"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lorg/pouyadr/push/Pushtelegram;->market:Ljava/lang/String;

    .line 17
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    iget-object v3, p0, Lorg/pouyadr/push/Pushtelegram;->PushLink:Ljava/lang/String;

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 19
    .local v1, "localIntent":Landroid/content/Intent;
    :try_start_28
    iget-object v2, p0, Lorg/pouyadr/push/Pushtelegram;->market:Ljava/lang/String;

    const-string v3, "telegram"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3e

    .line 20
    const-string v2, "org.telegram.messenger"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 30
    :cond_37
    :goto_37
    invoke-virtual {p0, v1}, Lorg/pouyadr/push/Pushtelegram;->startActivity(Landroid/content/Intent;)V

    .line 31
    invoke-virtual {p0}, Lorg/pouyadr/push/Pushtelegram;->finish()V

    .line 37
    :goto_3d
    return-void

    .line 23
    :cond_3e
    iget-object v2, p0, Lorg/pouyadr/push/Pushtelegram;->market:Ljava/lang/String;

    const-string v3, "mobo"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_56

    .line 24
    const-string v2, "com.hanista.mobogram"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_4d
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_4d} :catch_4e

    goto :goto_37

    .line 33
    :catch_4e
    move-exception v0

    .line 35
    .local v0, "localException":Ljava/lang/Exception;
    invoke-virtual {p0, v1}, Lorg/pouyadr/push/Pushtelegram;->startActivity(Landroid/content/Intent;)V

    .line 36
    invoke-virtual {p0}, Lorg/pouyadr/push/Pushtelegram;->finish()V

    goto :goto_3d

    .line 27
    .end local v0    # "localException":Ljava/lang/Exception;
    :cond_56
    :try_start_56
    iget-object v2, p0, Lorg/pouyadr/push/Pushtelegram;->market:Ljava/lang/String;

    const-string v3, "telefarsi"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_37

    .line 28
    const-string v2, "ir.persianfox.messenger"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_65
    .catch Ljava/lang/Exception; {:try_start_56 .. :try_end_65} :catch_4e

    goto :goto_37
.end method
