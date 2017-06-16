.class final Lorg/pouyadr/Pouya/Helper/AnsweringMachine$1;
.super Ljava/lang/Object;
.source "AnsweringMachine.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/pouyadr/Pouya/Helper/AnsweringMachine;->ProcessMsgs(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$m:Lorg/pouyadr/messenger/MessageObject;


# direct methods
.method constructor <init>(Lorg/pouyadr/messenger/MessageObject;)V
    .registers 2

    .prologue
    .line 58
    iput-object p1, p0, Lorg/pouyadr/Pouya/Helper/AnsweringMachine$1;->val$m:Lorg/pouyadr/messenger/MessageObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    .prologue
    .line 61
    const-string v0, "ProcessMsgs"

    const-string v1, "proccess"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    iget-object v0, p0, Lorg/pouyadr/Pouya/Helper/AnsweringMachine$1;->val$m:Lorg/pouyadr/messenger/MessageObject;

    invoke-static {v0}, Lorg/pouyadr/Pouya/Helper/AnsweringMachine;->ProcessMsg(Lorg/pouyadr/messenger/MessageObject;)Z

    .line 63
    return-void
.end method
