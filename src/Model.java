package saaransh;

class learner
{
	//double theta[][] = new double[4][1];
	double hypo[][];
	double cost[][];
	double learning_rate = 0.1;//old_vale=0.1;
	double iterations = 1000000;
	
	// Sigmoid Function for Hypothesis
	
	public double[][] sigmoid(double[][] feature,double[][] weights)
	{
		double[][] z = new double[feature.length][weights[0].length];
		double sum = 0;
		for(int i=0;i<feature.length;i++)
		{
			for(int j=0;j<weights[0].length;j++)
			{
				for(int k=0;k<weights.length;k++)
				{
					sum = sum + feature[i][k] * weights[k][j];
				}
				z[i][j] = sum;
				sum=0;
			}
		}
		hypo = new double[z.length][z[0].length];
		for(int i=0;i<z.length;i++)
		{
			for(int j=0;j<z[0].length;j++)
			{
				hypo[i][j] = (1/( 1+( Math.exp( (-1)*z[i][j] ) ) ) );
			}
		}
		return hypo;
	}
	
	// Cost Function J
	
	public double[][] cost(double[][] feature_value,double[][] parameters,double[][] y)
	{
		double sum=0;
		double[][] transpose_y = new double[y[0].length][y.length];
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y[0].length;j++)
			{
				transpose_y[j][i] = (-1)*y[i][j];
			}
		}
		double[][] transpose_y_minus = new double[y[0].length][y.length];
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y[0].length;j++)
			{
				transpose_y_minus[j][i] = (1-y[i][j]);
			}
		}
		double[][] hypothe = new double[feature_value.length][1];
		hypothe = sigmoid(feature_value,parameters);
		double[][] log_hypothe = new double[feature_value.length][1];
		for(int i=0;i<hypothe.length;i++)
		{
			for(int j=0;j<hypothe[0].length;j++)
			{
				log_hypothe[i][j] = Math.log(hypothe[i][j]);
			}
		}
		double[][] log_hypothe_minus = new double[feature_value.length][1];
		for(int i=0;i<log_hypothe_minus.length;i++)
		{
			for(int j=0;j<log_hypothe_minus[0].length;j++)
			{
				log_hypothe_minus[i][j] = Math.log(1-hypothe[i][j]);
			}
		}
		double[][] a = new double[1][1];
		double[][] b = new double[1][1];
		for(int i=0;i<transpose_y.length;i++)
		{
			for(int j=0;j<log_hypothe[0].length;j++)
			{
				for(int k=0;k<log_hypothe.length;k++)
				{
					sum = sum + transpose_y[i][k] * log_hypothe[k][j];
				}
				a[i][j] = sum;
				sum=0;
			}
		}
		for(int i=0;i<transpose_y_minus.length;i++)
		{
			for(int j=0;j<log_hypothe_minus[0].length;j++)
			{
				for(int k=0;k<log_hypothe_minus.length;k++)
				{
					sum = sum + transpose_y_minus[i][k] * log_hypothe_minus[k][j];
				}
				b[i][j] = sum;
				sum=0;
			}
		}
		cost = new double[1][1];
		for(int i=0;i<cost.length;i++)
		{
			for(int j=0;j<cost[0].length;j++)
			{
				cost[i][j] = ((a[i][j]-b[i][j])/feature_value.length);
			}
		}
		
		/*
		for(int i=0;i<cost.length;i++)
		{
			for(int j=0;j<cost[0].length;j++)
			{
			System.out.println(cost[i][j]);
			}
		}
		*/
		return cost;
	}
	
	// Gradient Descent for parameter optimization
	
	//Gradient Calculation
	public double[][] gradient(double[][] feature_val, double[][] theta,double[][] prediction)
	{
		double sum=0;
		double[][] hypothesis = new double[feature_val.length][theta[0].length];
		double[][] hypo_minus_predict = new double[hypothesis.length][hypothesis[0].length];
		double[][] feature_val_transpose = new double[feature_val[0].length][feature_val.length];
		double[][] secondterm_product = new double[theta.length][1];
		// double[][] grad = new double[theta.length][1];
				hypothesis = sigmoid(feature_val,theta);
		
		for(int i=0;i<hypothesis.length;i++)
		{
			for(int j=0;j<hypothesis[0].length;j++)
			{
				hypo_minus_predict[i][j] = (hypothesis[i][j] - prediction[i][j]); 
			}
		}
		
		for(int i=0;i<feature_val.length;i++)
		{
			for(int j=0;j<feature_val[0].length;j++)
			{
				feature_val_transpose[j][i] = feature_val[i][j];
			}
		}
		
		/*
		double[][] secondterm_minus = new double[feature_val.length][1];
		for(int i=0;i<feature_val.length;i++)
		{
			for(int j=0;j<feature_val[0].length;j++)
			{
				secondterm_minus[i][j] = hypothesis[i][j]-prediction[i][j];
			}
		}
		*/
		
		
		for(int i=0;i<feature_val_transpose.length;i++)
		{
			for(int j=0;j<hypo_minus_predict[0].length;j++)
			{
				for(int k=0;k<hypo_minus_predict.length;k++)
				{
					sum = sum + feature_val_transpose[i][k] * hypo_minus_predict[k][j];
				}
				secondterm_product[i][j] = sum;
				sum=0;
			}
		}
		
		/*
		double[][] cost_function = new double[1][1];
		
		for(int k=0;k<iterations;k++)
		{
			for(int i=0;i<theta.length;i++)
			{
				for(int j=0;j<theta[0].length;j++)
				{
					theta[i][j] = theta[i][j] - (((learning_rate/feature_val.length) * secondterm_product[i][j]));
				}
			}
		*/
			
			/*
			for(int i=0;i<1;i++)
			{
				for(int j=0;j<1;j++)
				{
					cost_function = cost(feature_val,theta,prediction);
					System.out.println(cost_function[i][j]);
				}
			}
			*/
		
		
		return secondterm_product;
}

	
	//Parameter Update
	
	public double[][] parameter_update(double[][] features_val,double[][] parameter_val,double[][] label)
	{
		// double[][] updated_theta = new double[parameter_val.length][parameter_val[0].length];
		double[][] secondpart = new double[parameter_val.length][parameter_val[0].length];
		double[][] cost_function = new double[label[0].length][features_val[0].length];
		for(int k=0;k<iterations;k++)
		{
			secondpart = gradient(features_val,parameter_val,label);
			for(int i=0;i<parameter_val.length;i++)
			{
				for(int j=0;j<parameter_val[0].length;j++)
				{
					parameter_val[i][j] = parameter_val[i][j] - (((learning_rate/features_val.length) * secondpart[i][j]));
				}
			}
			
			
			for(int i=0;i<1;i++)
			{
				for(int j=0;j<1;j++)
				{
					cost_function = cost(features_val,parameter_val,label);
					System.out.println(cost_function[i][j]);
				}
			}
			
			
	
		}
		
		return parameter_val;
	}
	
	//Classifier
	public double[][] classify(double[][] feature_values,double[][] weights)
	{
		double[][] predicted_value = new double[feature_values.length][weights[0].length];
		predicted_value = sigmoid(feature_values,weights);
		return predicted_value;
	}
}

public class Model{
	public static void main(String args[])
	{
		double features[][] = {
{1.0,0.55042017,1.0,0.30769232,0.1693600590820944},
{1.0,0.85294116,0.95238096,0.35384616,0.3018099541719456},
{1.0,0.15126051,0.9047619,0.07692308,0.0116354243115708},
{1.0,1.0,0.85714287,1.0,1.0},
{1.0,0.6134454,0.8095238,0.5538462,0.33975440369748},
{1.0,0.20588236,0.7619048,0.06153846,0.0126696833755656},
{1.0,0.13865547,0.71428573,0.13846155,0.0191984512921785},
{1.0,0.6344538,0.6666667,0.07692308,0.048804140413704},
{1.0,0.13445379,0.61904764,0.06153846,0.0082740791777634},
{1.0,0.34033614,0.5714286,0.12307692,0.0418875238758888},
{1.0,0.13025211,0.52380955,0.16923077,0.022042664869424702},
{1.0,0.24369748,0.47619048,0.2,0.048739496},
{1.0,0.071428575,0.42857143,0.06153846,0.0043956045054944996},
{1.0,0.13865547,0.3809524,0.18461539,0.025597933669683298},
{1.0,0.5966387,0.33333334,0.8,0.47731096},
{1.0,0.17226891,0.2857143,0.12307692,0.0212023268545572},
{1.0,0.28991598,0.23809524,0.5692308,0.165029105228184},
{1.0,0.57563025,0.1904762,0.64615387,0.37194571372656754},
{1.0,0.9285714,0.14285715,0.9230769,0.85714280934066},
{1.0,0.5462185,0.0952381,0.7076923,0.3865546265675501},
{1.0,0.05042017,0.04761905,0.015384615,7.7569490368455E-4},
{1.0,0.394958,0.0,0.33846155,0.13367809686489998},
{1.0,0.394958,0.04761905,0.21538462,0.08506787874595999},
{1.0,0.3697479,0.0952381,0.4923077,0.18202973822883},
{1.0,0.067226894,0.14285715,0.046153847,0.0031027797799612175},
{1.0,0.57563025,0.1904762,0.35384616,0.20368455354234002},
{1.0,0.16386555,0.23809524,0.15384616,0.025210085623788},
{1.0,0.016806724,0.2857143,0.046153847,7.756949680672279E-4},
{1.0,0.25630254,0.33333334,0.16923077,0.0433742761971558},
{1.0,0.6764706,0.3809524,0.46153846,0.312217198959276},
{1.0,0.30252102,0.42857143,0.4923077,0.148933427557854},
{1.0,0.28151262,0.47619048,0.18461539,0.051971562131221796},
{1.0,0.14705883,0.52380955,0.092307694,0.01357466147963802},
{1.0,0.31092438,0.5714286,0.2923077,0.090885590391726},
{1.0,0.42016807,0.61904764,0.13846155,0.058177122232708496},
{1.0,0.075630255,0.6666667,0.03076923,0.00232708471105365},
{1.0,0.40756303,0.71428573,0.10769231,0.043891404171299296},
{1.0,0.15126051,0.7619048,0.12307692,0.0186166776884292},
{1.0,0.18907563,0.8095238,0.10769231,0.0203619913594053},
{1.0,0.25210086,0.85714287,0.10769231,0.0271493239663866},
{1.0,0.15546219,0.9047619,0.07692308,0.011958630478345202},
{1.0,0.4117647,0.95238096,0.15384616,0.063348417918552},
{1.0,0.3487395,1.0,0.2,0.0697479},
{1.0,0.5176471,1.0,0.13333334,0.069019616784314},
{1.0,0.5,0.90909094,0.093333334,0.046666667},
{1.0,0.6,0.8181818,0.41333333,0.247999998},
{1.0,0.24117647,0.72727275,0.093333334,0.02250980402745098},
{1.0,0.24705882,0.6363636,0.06666667,0.0164705888235294},
{1.0,0.84117645,0.54545456,0.61333334,0.515921561607843},
{1.0,0.21764706,0.45454547,0.17333333,0.0377254896745098},
{1.0,0.30588236,0.36363637,0.24,0.07341176640000001},
{1.0,0.27058825,0.27272728,0.26666668,0.07215687027451},
{1.0,0.20588236,0.18181819,0.18666667,0.0384313745529412},
{1.0,1.0,0.09090909,1.0,1.0},
{1.0,0.14705883,0.0,0.08,0.0117647064},
{1.0,0.27058825,0.09090909,0.29333332,0.07937254972548999},
{1.0,0.44705883,0.18181819,0.16,0.07152941280000001},
{1.0,0.5117647,0.27272728,0.16,0.08188235199999999},
{1.0,0.16470589,0.36363637,0.21333334,0.0351372576313726},
{1.0,0.20588236,0.45454547,0.13333334,0.027450982705882396},
{1.0,0.23529412,0.54545456,0.093333334,0.02196078469019608},
{1.0,0.45294118,0.6363636,0.29333332,0.1328627400941176},
{1.0,0.5294118,0.72727275,0.36,0.190588248},
{1.0,0.4,0.8181818,0.30666667,0.12266666799999999},
{1.0,0.28235295,0.90909094,0.08,0.022588236},
{1.0,0.20588236,1.0,0.10666667,0.0219607857529412}
			};
		double thetas[][] = {
			//	{-2.7346184277846506},
			//	{0.024476504490013314},
			//	{0.02302979007734361},		
				{0},
				{0},
				{0},
				{0},
				{0},
				//{-7.054457763626635},
				//{4.2515750417828455},
				//{5.096226353828996},
				//{4.083813007993175},
		};
		double predict[][] = {
				{1},
				{0},	//{0},
				{1},
				{0},	//{0},
				{1},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},	//{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{1},
				{1},
				{0},
				{0},
				{0},
				{0},
				{0},
				{1},
				{0},
				{0},
				{0},
				{0},
				{1},	//{1},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{1},
				{1},
				{0},
				//DATA2
				{1},
				{0},
				{0},
				{0},
				{0},
				{1},
				{0},
				{0},
				{1},
				{0},
				{1},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{1},
				{0},
				{0},
				{0},
							};
		
		/*
		for(int i=0;i<features.length;i++)
		{
			for(int j=0;j<features[0].length;j++)
			{
				features[i+1][j+1] = features[i][j];
				features[i][j] = 0;
				System.out.print(features[i][j]);
			}
		}
		*/
		double[][] data = {
				{1,1,1,1,1}
		};
		learner lr = new learner();
		double[][] tr = new double[4][];
		tr = lr.sigmoid(features,thetas);
		System.out.println(tr[0][0]);
		System.out.println();
		tr = lr.cost(features,thetas,predict);
		System.out.println(tr[0][0]);
		System.out.println();
		tr = lr.gradient(features,thetas,predict);
		tr = lr.parameter_update(features,thetas,predict);
		System.out.println(tr[0][0]);
		System.out.println(tr[1][0]);
		System.out.println(tr[2][0]);
		System.out.println(tr[3][0]);
		System.out.println(tr[4][0]);
		System.out.println();
		tr = lr.classify(data, thetas);
		System.out.println(tr[0][0]);
		
		//System.out.println(tr[3][0]);
	
	}
}
