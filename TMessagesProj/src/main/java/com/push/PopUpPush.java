.class public Lorg/pouyadr/push/PopUpPush;
.super Landroid/app/Activity;
.source "PopUpPush.java"


# instance fields
.field PushLink:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .registers 6
    .param p1, "paramBundle"    # Landroid/os/Bundle;

    .prologue
    .line 21
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 23
    invoke-virtual {p0}, Lorg/pouyadr/push/PopUpPush;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "PushLink"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/pouyadr/push/PopUpPush;->PushLink:Ljava/lang/String;

    .line 28
    :try_start_f
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    iget-object v3, p0, Lorg/pouyadr/push/PopUpPush;->PushLink:Ljava/lang/String;

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Lorg/pouyadr/push/PopUpPush;->startActivity(Landroid/content/Intent;)V

    .line 31
    invoke-virtual {p0}, Lorg/pouyadr/push/PopUpPush;->finish()V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_22} :catch_23

    .line 37
    :goto_22
    return-void

    .line 33
    :catch_23
    move-exception v0

    .line 34
    .local v0, "localException":Ljava/lang/Exception;
    const-string v1, "LOG"

    const-string v2, "log"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    invoke-virtual {p0}, Lorg/pouyadr/push/PopUpPush;->finish()V

    goto :goto_22
.end method
