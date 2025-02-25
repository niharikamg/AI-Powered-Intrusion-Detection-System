import pandas as pd
from sklearn.ensemble import RandomForestClassifier
from sklearn.model_selection import train_test_split
import joblib

# Load dataset (replace with real security logs dataset)
df = pd.read_csv("security_logs.csv")

# Prepare features and labels
X = df[['source_ip', 'destination_ip', 'severity']]
y = df['threat_level']

# Train model
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2)
model = RandomForestClassifier()
model.fit(X_train, y_train)

# Save model
joblib.dump(model, "intrusion_model.pkl")