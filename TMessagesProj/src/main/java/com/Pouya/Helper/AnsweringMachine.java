.class public Lorg/pouyadr/Pouya/Helper/AnsweringMachine;
.super Ljava/lang/Object;
.source "AnsweringMachine.java"


# static fields
.field public static ListOfMsgs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/pouyadr/messenger/MessageObject;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .prologue
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lorg/pouyadr/Pouya/Helper/AnsweringMachine;->ListOfMsgs:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ProcessMsg(Lorg/pouyadr/messenger/MessageObject;)Z
    .registers 9
    .param p0, "messageObject"    # Lorg/pouyadr/messenger/MessageObject;

    .prologue
    const/4 v7, 0x0

    .line 20
    const-string v4, "answm"

    const-string v5, "part1"

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->getAnsweringMachine()Z

    move-result v4

    if-eqz v4, :cond_7d

    .line 22
    const-string v4, "answm"

    const-string v5, "part2"

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->getAnsweringmachineText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_7d

    .line 24
    const-string v4, "answm"

    const-string v5, "part3"

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    invoke-virtual {p0}, Lorg/pouyadr/messenger/MessageObject;->getDialogId()J

    move-result-wide v2

    .line 26
    .local v2, "userid":J
    const-string v4, "answm"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "part4 userid:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    invoke-static {}, Lorg/pouyadr/messenger/MessagesController;->getInstance()Lorg/pouyadr/messenger/MessagesController;

    move-result-object v4

    long-to-int v5, v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Lorg/pouyadr/messenger/MessagesController;->getUser(Ljava/lang/Integer;)Lorg/pouyadr/tgnet/TLRPC$User;

    move-result-object v1

    .line 29
    .local v1, "user":Lorg/pouyadr/tgnet/TLRPC$User;
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_7d

    if-eqz v1, :cond_7d

    iget-boolean v4, v1, Lorg/pouyadr/tgnet/TLRPC$User;->bot:Z

    if-nez v4, :cond_7d

    .line 30
    const-string v4, "answm"

    const-string v5, "part5"

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->getAnsweringmachineText()Ljava/lang/String;

    move-result-object v0

    .line 32
    .local v0, "msg":Ljava/lang/String;
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v4}, Lorg/pouyadr/Pouya/Helper/UserHistorysend;->isok(Ljava/lang/Long;)Z

    move-result v4

    if-eqz v4, :cond_7d

    .line 33
    const-string v4, "answm"

    const-string v5, "part6"

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    invoke-static {v0, v2, v3, p0}, Lorg/pouyadr/Pouya/Helper/AnsweringMachine;->SendText(Ljava/lang/String;JLorg/pouyadr/messenger/MessageObject;)V

    .line 35
    invoke-static {v2, v3}, Lorg/pouyadr/Pouya/Helper/UserHistorysend;->add(J)V

    .line 46
    .end local v0    # "msg":Ljava/lang/String;
    .end local v1    # "user":Lorg/pouyadr/tgnet/TLRPC$User;
    .end local v2    # "userid":J
    :cond_7d
    return v7
.end method

.method public static ProcessMsgs(Ljava/util/ArrayList;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lorg/pouyadr/messenger/MessageObject;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 55
    .local p0, "listofdialogs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/pouyadr/messenger/MessageObject;>;"
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_21

    .line 56
    move v0, v1

    .line 57
    .local v0, "finalI":I
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/pouyadr/messenger/MessageObject;

    .line 58
    .local v2, "m":Lorg/pouyadr/messenger/MessageObject;
    new-instance v3, Landroid/os/Handler;

    invoke-direct {v3}, Landroid/os/Handler;-><init>()V

    new-instance v4, Lorg/pouyadr/Pouya/Helper/AnsweringMachine$1;

    invoke-direct {v4, v2}, Lorg/pouyadr/Pouya/Helper/AnsweringMachine$1;-><init>(Lorg/pouyadr/messenger/MessageObject;)V

    mul-int/lit16 v5, v1, 0x3e8

    int-to-long v6, v5

    invoke-virtual {v3, v4, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 55
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 67
    .end local v0    # "finalI":I
    .end local v2    # "m":Lorg/pouyadr/messenger/MessageObject;
    :cond_21
    return-void
.end method

.method public static SendText(Ljava/lang/String;JLorg/pouyadr/messenger/MessageObject;)V
    .registers 15
    .param p0, "msg"    # Ljava/lang/String;
    .param p1, "userid"    # J
    .param p3, "msgforreplay"    # Lorg/pouyadr/messenger/MessageObject;

    .prologue
    const/4 v6, 0x1

    const/4 v4, 0x0

    .line 49
    const-string v0, "answm"

    const-string v1, "part7"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    invoke-static {}, Lorg/pouyadr/messenger/SendMessagesHelper;->getInstance()Lorg/pouyadr/messenger/SendMessagesHelper;

    move-result-object v0

    move-object v1, p0

    move-wide v2, p1

    move-object v5, v4

    move v7, v6

    move-object v8, v4

    move-object v9, v4

    move-object v10, v4

    invoke-virtual/range {v0 .. v10}, Lorg/pouyadr/messenger/SendMessagesHelper;->sendMessage(Ljava/lang/String;JLorg/pouyadr/messenger/MessageObject;Lorg/pouyadr/tgnet/TLRPC$WebPage;ZZLjava/util/ArrayList;Lorg/pouyadr/tgnet/TLRPC$ReplyMarkup;Ljava/util/HashMap;)V

    .line 51
    invoke-static {}, Lorg/pouyadr/messenger/MessagesController;->getInstance()Lorg/pouyadr/messenger/MessagesController;

    move-result-object v0

    invoke-virtual {v0, p3}, Lorg/pouyadr/messenger/MessagesController;->markMessageContentAsRead(Lorg/pouyadr/messenger/MessageObject;)V

    .line 52
    return-void
.end method
