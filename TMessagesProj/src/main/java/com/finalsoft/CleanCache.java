.class public Lorg/pouyadr/finalsoft/CleanCache;
.super Ljava/lang/Object;
.source "CleanCache.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cleanDatabaseRow(Landroid/content/Context;)V
    .registers 6
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v3, 0x0

    .line 29
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 30
    .local v0, "progressDialog":Landroid/app/ProgressDialog;
    const-string v1, "Loading"

    const v2, 0x7f0801f7

    invoke-static {v1, v2}, Lorg/pouyadr/messenger/LocaleController;->getString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 31
    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 32
    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 33
    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 34
    invoke-static {}, Lorg/pouyadr/messenger/MessagesStorage;->getInstance()Lorg/pouyadr/messenger/MessagesStorage;

    move-result-object v1

    invoke-virtual {v1}, Lorg/pouyadr/messenger/MessagesStorage;->getStorageQueue()Lorg/pouyadr/messenger/DispatchQueue;

    move-result-object v1

    new-instance v2, Lorg/pouyadr/finalsoft/CleanCache$1;

    invoke-direct {v2, p0, v0}, Lorg/pouyadr/finalsoft/CleanCache$1;-><init>(Lorg/pouyadr/finalsoft/CleanCache;Landroid/app/ProgressDialog;)V

    invoke-virtual {v1, v2}, Lorg/pouyadr/messenger/DispatchQueue;->postRunnable(Ljava/lang/Runnable;)V

    .line 132
    return-void
.end method
