.class public Lorg/pouyadr/Pouya/Models/Favor;
.super Ljava/lang/Object;
.source "Favor.java"


# instance fields
.field private userid:Ljava/lang/Long;

.field private username:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;)V
    .registers 3
    .param p1, "userid"    # Ljava/lang/Long;

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lorg/pouyadr/Pouya/Models/Favor;->userid:Ljava/lang/Long;

    .line 12
    iget-object v0, p0, Lorg/pouyadr/Pouya/Models/Favor;->username:Ljava/lang/String;

    iput-object v0, p0, Lorg/pouyadr/Pouya/Models/Favor;->username:Ljava/lang/String;

    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 4
    .param p1, "user"    # Ljava/lang/String;

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lorg/pouyadr/Pouya/Models/Favor;->username:Ljava/lang/String;

    .line 21
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lorg/pouyadr/Pouya/Models/Favor;->userid:Ljava/lang/Long;

    .line 22
    return-void
.end method


# virtual methods
.method public getUserid()J
    .registers 3

    .prologue
    .line 25
    iget-object v0, p0, Lorg/pouyadr/Pouya/Models/Favor;->userid:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getUsername()Ljava/lang/String;
    .registers 2

    .prologue
    .line 33
    iget-object v0, p0, Lorg/pouyadr/Pouya/Models/Favor;->username:Ljava/lang/String;

    return-object v0
.end method

.method public setUserid(J)V
    .registers 4
    .param p1, "userid"    # J

    .prologue
    .line 29
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lorg/pouyadr/Pouya/Models/Favor;->userid:Ljava/lang/Long;

    .line 30
    return-void
.end method

.method public setUsername(Ljava/lang/String;)V
    .registers 2
    .param p1, "username"    # Ljava/lang/String;

    .prologue
    .line 37
    iput-object p1, p0, Lorg/pouyadr/Pouya/Models/Favor;->username:Ljava/lang/String;

    .line 38
    return-void
.end method
