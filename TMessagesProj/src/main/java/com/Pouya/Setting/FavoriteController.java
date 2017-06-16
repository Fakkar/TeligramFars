.class public Lorg/pouyadr/Pouya/Setting/FavoriteController;
.super Ljava/lang/Object;
.source "FavoriteController.java"


# static fields
.field private static fav:Lorg/pouyadr/Pouya/Setting/FavoriteController;

.field private static thiscontext:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static IsFaver(Ljava/lang/Long;)Z
    .registers 2
    .param p0, "aLong"    # Ljava/lang/Long;

    .prologue
    .line 44
    invoke-static {p0}, Lorg/pouyadr/Pouya/Setting/FavoriteController;->isFavor(Ljava/lang/Long;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static addToFavor(Ljava/lang/Long;)V
    .registers 4
    .param p0, "id"    # Ljava/lang/Long;

    .prologue
    .line 16
    :try_start_0
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->getFavorList()Ljava/lang/String;

    move-result-object v0

    .line 18
    .local v0, "m":Ljava/lang/String;
    invoke-static {p0}, Lorg/pouyadr/Pouya/Setting/FavoriteController;->isFavor(Ljava/lang/Long;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2b

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 23
    :goto_27
    invoke-static {v0}, Lorg/pouyadr/Pouya/Setting/Setting;->setFavorList(Ljava/lang/String;)V

    .line 25
    .end local v0    # "m":Ljava/lang/String;
    :goto_2a
    return-void

    .line 21
    .restart local v0    # "m":Ljava/lang/String;
    :cond_2b
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_45
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_45} :catch_47

    move-result-object v0

    goto :goto_27

    .line 24
    .end local v0    # "m":Ljava/lang/String;
    :catch_47
    move-exception v1

    goto :goto_2a
.end method

.method public static addToFavor(Ljava/lang/String;)V
    .registers 4
    .param p0, "user"    # Ljava/lang/String;

    .prologue
    .line 28
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->getFavorList()Ljava/lang/String;

    move-result-object v0

    .line 29
    .local v0, "m":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-static {v0}, Lorg/pouyadr/Pouya/Setting/Setting;->setFavorList(Ljava/lang/String;)V

    .line 31
    return-void
.end method

.method public static isFavor(Ljava/lang/Long;)Ljava/lang/Boolean;
    .registers 4
    .param p0, "id"    # Ljava/lang/Long;

    .prologue
    .line 39
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->getFavorList()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    .line 40
    .local v0, "m":Z
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method

.method public static isFavor(Ljava/lang/String;)Ljava/lang/Boolean;
    .registers 3
    .param p0, "user"    # Ljava/lang/String;

    .prologue
    .line 34
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->getFavorList()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    .line 35
    .local v0, "m":Z
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method
