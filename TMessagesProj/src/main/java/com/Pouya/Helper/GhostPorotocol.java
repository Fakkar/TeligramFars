.class public Lorg/pouyadr/Pouya/Helper/GhostPorotocol;
.super Ljava/lang/Object;
.source "GhostPorotocol.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static toggleGhostPortocol()V
    .registers 2

    .prologue
    .line 12
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->getGhostMode()Z

    move-result v1

    if-nez v1, :cond_b

    const/4 v0, 0x1

    .line 13
    .local v0, "m":Z
    :goto_7
    invoke-static {v0}, Lorg/pouyadr/Pouya/Helper/GhostPorotocol;->trun(Z)V

    .line 14
    return-void

    .line 12
    .end local v0    # "m":Z
    :cond_b
    const/4 v0, 0x0

    goto :goto_7
.end method

.method public static trun(Z)V
    .registers 2
    .param p0, "on"    # Z

    .prologue
    .line 20
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lorg/pouyadr/Pouya/Setting/Setting;->setGhostMode(Ljava/lang/Boolean;)V

    .line 21
    if-eqz p0, :cond_14

    .line 22
    invoke-static {}, Lorg/pouyadr/Pouya/Helper/NotiFicationMaker;->createNotification()V

    .line 27
    :goto_c
    invoke-static {}, Lorg/pouyadr/messenger/MessagesController;->getInstance()Lorg/pouyadr/messenger/MessagesController;

    move-result-object v0

    invoke-virtual {v0}, Lorg/pouyadr/messenger/MessagesController;->reRunUpdateTimerProc()V

    .line 29
    return-void

    .line 24
    :cond_14
    invoke-static {}, Lorg/pouyadr/Pouya/Helper/NotiFicationMaker;->cancelNotification()V

    goto :goto_c
.end method

.method public static update()V
    .registers 1

    .prologue
    .line 16
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->getGhostMode()Z

    move-result v0

    .line 17
    .local v0, "m":Z
    invoke-static {v0}, Lorg/pouyadr/Pouya/Helper/GhostPorotocol;->trun(Z)V

    .line 18
    return-void
.end method
