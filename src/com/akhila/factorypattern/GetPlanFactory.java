package com.akhila.factorypattern;
class GetPlanFactory {
	public BillPlans getPlan(String planType)
	{
		if(planType == null)
		{
			return null;
		}
		if(planType.equalsIgnoreCase("DomesticPlan"))
				{
					return new DomesticPlan();
				}
		else if (planType.equalsIgnoreCase("CommericalPlans"))
		{
	return new CommericalPlans();
		}
else if (planType.equalsIgnoreCase("InstitutePlans"))
			{
		return new InstitutePlans();
}
return null;
}
}

