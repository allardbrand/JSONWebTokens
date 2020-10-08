package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(deeplink.actions.ExecuteDeeplink.class);
    registrator.registerUserAction(deeplink.actions.GetApplicationUrl.class);
    registrator.registerUserAction(deeplink.actions.GetCurrentSessionID.class);
    registrator.registerUserAction(deeplink.actions.ReadMicroflows.class);
    registrator.registerUserAction(deeplink.actions.StartDeeplinkJava.class);
    registrator.registerUserAction(jsonwebtoken.actions.JA_DecodeClaim.class);
    registrator.registerUserAction(jsonwebtoken.actions.JA_DecodeHeaderClaim.class);
    registrator.registerUserAction(jsonwebtoken.actions.JA_DecodeToken.class);
    registrator.registerUserAction(jsonwebtoken.actions.JA_GenerateToken.class);
    registrator.registerUserAction(jsonwebtoken.actions.JA_VerifyToken.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
