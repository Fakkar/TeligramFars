.class Lorg/pouyadr/finalsoft/CleanCache$1$1;
.super Ljava/lang/Object;
.source "CleanCache.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/pouyadr/finalsoft/CleanCache$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/pouyadr/finalsoft/CleanCache$1;


# direct methods
.method constructor <init>(Lorg/pouyadr/finalsoft/CleanCache$1;)V
    .registers 2
    .param p1, "this$1"    # Lorg/pouyadr/finalsoft/CleanCache$1;

    .prologue
    .line 114
    iput-object p1, p0, Lorg/pouyadr/finalsoft/CleanCache$1$1;->this$1:Lorg/pouyadr/finalsoft/CleanCache$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    .prologue
    .line 118
    :try_start_0
    iget-object v1, p0, Lorg/pouyadr/finalsoft/CleanCache$1$1;->this$1:Lorg/pouyadr/finalsoft/CleanCache$1;

    iget-object v1, v1, Lorg/pouyadr/finalsoft/CleanCache$1;->val$progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_7} :catch_8

    .line 127
    :goto_7
    return-void

    .line 119
    :catch_8
    move-exception v0

    .line 120
    .local v0, "e":Ljava/lang/Exception;
    const-string v1, "tmessages"

    invoke-static {v1, v0}, Lorg/pouyadr/messenger/FileLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_7
.end method
